package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_176 {
    private final Production53_176 production = new Production53_176("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}