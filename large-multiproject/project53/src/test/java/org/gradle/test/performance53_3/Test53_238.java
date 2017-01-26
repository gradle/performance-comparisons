package org.gradle.test.performance53_3;

import static org.junit.Assert.*;

public class Test53_238 {
    private final Production53_238 production = new Production53_238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}