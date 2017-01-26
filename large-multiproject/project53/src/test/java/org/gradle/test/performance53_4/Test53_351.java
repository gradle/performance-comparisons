package org.gradle.test.performance53_4;

import static org.junit.Assert.*;

public class Test53_351 {
    private final Production53_351 production = new Production53_351("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}