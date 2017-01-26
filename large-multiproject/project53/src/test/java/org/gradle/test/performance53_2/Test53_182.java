package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_182 {
    private final Production53_182 production = new Production53_182("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}