package org.gradle.test.performance53_1;

import static org.junit.Assert.*;

public class Test53_11 {
    private final Production53_11 production = new Production53_11("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}