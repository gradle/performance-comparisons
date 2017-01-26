package org.gradle.test.performance53_3;

import static org.junit.Assert.*;

public class Test53_278 {
    private final Production53_278 production = new Production53_278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}