package lotto.business

class LottoTicket(lottoNumbers: Set<LottoNumber>) : LottoNumberSet(lottoNumbers) {
    init {
        validateNumbers()
    }

    fun matchCount(targetLottoNumbers: List<LottoNumber>): Int {
        return targetLottoNumbers.count(sortedLottoNumbers::contains)
    }

    fun contains(targetLottoNumber: LottoNumber): Boolean {
        return lottoNumbers.contains(targetLottoNumber)
    }
}
