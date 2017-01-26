package org.gradle.test.performance53_4;

import static org.junit.Assert.*;

public class Test53_313 {
    private final Production53_313 production = new Production53_313("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}