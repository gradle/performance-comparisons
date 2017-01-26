package org.gradle.test.performance53_5;

import static org.junit.Assert.*;

public class Test53_401 {
    private final Production53_401 production = new Production53_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}