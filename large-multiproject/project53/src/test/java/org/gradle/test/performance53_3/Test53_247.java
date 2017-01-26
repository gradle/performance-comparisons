package org.gradle.test.performance53_3;

import static org.junit.Assert.*;

public class Test53_247 {
    private final Production53_247 production = new Production53_247("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}