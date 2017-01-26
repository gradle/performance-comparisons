package org.gradle.test.performance53_1;

import static org.junit.Assert.*;

public class Test53_59 {
    private final Production53_59 production = new Production53_59("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}