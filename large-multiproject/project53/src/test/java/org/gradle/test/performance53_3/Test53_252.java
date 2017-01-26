package org.gradle.test.performance53_3;

import static org.junit.Assert.*;

public class Test53_252 {
    private final Production53_252 production = new Production53_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}