package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_171 {
    private final Production53_171 production = new Production53_171("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}