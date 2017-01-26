package org.gradle.test.performance53_5;

import static org.junit.Assert.*;

public class Test53_462 {
    private final Production53_462 production = new Production53_462("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}