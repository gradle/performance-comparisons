package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_175 {
    private final Production53_175 production = new Production53_175("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}