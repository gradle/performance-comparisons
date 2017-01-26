package org.gradle.test.performance53_3;

import static org.junit.Assert.*;

public class Test53_244 {
    private final Production53_244 production = new Production53_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}