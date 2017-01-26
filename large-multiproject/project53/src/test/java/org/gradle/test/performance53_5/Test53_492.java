package org.gradle.test.performance53_5;

import static org.junit.Assert.*;

public class Test53_492 {
    private final Production53_492 production = new Production53_492("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}