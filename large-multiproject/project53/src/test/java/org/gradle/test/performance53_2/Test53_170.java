package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_170 {
    private final Production53_170 production = new Production53_170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}