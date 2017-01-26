package org.gradle.test.performance53_3;

import static org.junit.Assert.*;

public class Test53_274 {
    private final Production53_274 production = new Production53_274("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}