package org.gradle.test.performance53_4;

import static org.junit.Assert.*;

public class Test53_387 {
    private final Production53_387 production = new Production53_387("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}