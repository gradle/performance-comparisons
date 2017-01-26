package org.gradle.test.performance53_5;

import static org.junit.Assert.*;

public class Test53_426 {
    private final Production53_426 production = new Production53_426("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}