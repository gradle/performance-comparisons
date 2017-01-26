package org.gradle.test.performance53_4;

import static org.junit.Assert.*;

public class Test53_365 {
    private final Production53_365 production = new Production53_365("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}