package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_190 {
    private final Production53_190 production = new Production53_190("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}