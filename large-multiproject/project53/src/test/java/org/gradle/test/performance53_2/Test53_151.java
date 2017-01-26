package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_151 {
    private final Production53_151 production = new Production53_151("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}