package org.gradle.test.performance53_3;

import static org.junit.Assert.*;

public class Test53_242 {
    private final Production53_242 production = new Production53_242("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}