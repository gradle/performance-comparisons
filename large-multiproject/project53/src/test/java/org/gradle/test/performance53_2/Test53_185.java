package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_185 {
    private final Production53_185 production = new Production53_185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}