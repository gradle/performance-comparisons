package org.gradle.test.performance53_4;

import static org.junit.Assert.*;

public class Test53_342 {
    private final Production53_342 production = new Production53_342("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}