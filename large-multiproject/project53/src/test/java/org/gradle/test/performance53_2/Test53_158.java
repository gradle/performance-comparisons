package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_158 {
    private final Production53_158 production = new Production53_158("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}