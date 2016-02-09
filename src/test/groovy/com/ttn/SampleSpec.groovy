package com.ttn

import spock.lang.Specification

/**
 * Created by sachin on 09/02/16.
 */
class SampleSpec extends Specification {

    def "Test sample"() {
        when:
            def a = 1
        then:
            assert a == 1
    }
}
