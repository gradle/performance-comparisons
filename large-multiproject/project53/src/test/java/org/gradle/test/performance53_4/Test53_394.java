package org.gradle.test.performance53_4;

import static org.junit.Assert.*;

public class Test53_394 {
    private final Production53_394 production = new Production53_394("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}