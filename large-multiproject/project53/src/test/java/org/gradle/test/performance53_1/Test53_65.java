package org.gradle.test.performance53_1;

import static org.junit.Assert.*;

public class Test53_65 {
    private final Production53_65 production = new Production53_65("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}