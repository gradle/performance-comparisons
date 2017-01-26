package org.gradle.test.performance53_1;

import static org.junit.Assert.*;

public class Test53_56 {
    private final Production53_56 production = new Production53_56("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}