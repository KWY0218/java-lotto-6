package lotto.model;

import camp.nextstep.edu.missionutils.Randoms;
import lotto.domain.Lotto;
import lotto.domain.LottoMatch;

import java.util.ArrayList;
import java.util.List;

public class LottoModel {
    private final static int START_NUMBER = 1;
    private final static int END_NUMBER = 45;
    private final static int LOTTO_NUMBER_COUNT = 6;

    public List<Lotto> getRandomLottos(final int lottoCount) {
        List<Lotto> lottos = new ArrayList<>();
        for (int i = 0; i < lottoCount; i++) {
            Lotto lotto = getRandomLotto();
            lottos.add(lotto);
        }
        return lottos;
    }

    private Lotto getRandomLotto() {
        List<Integer> numbers = Randoms.pickUniqueNumbersInRange(START_NUMBER, END_NUMBER, LOTTO_NUMBER_COUNT)
                .stream()
                .sorted()
                .collect(Collectors.toList());
        return new Lotto(numbers);
    }

}