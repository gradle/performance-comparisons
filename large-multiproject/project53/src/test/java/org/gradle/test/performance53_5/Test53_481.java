package org.gradle.test.performance53_5;

import static org.junit.Assert.*;

public class Test53_481 {
    private final Production53_481 production = new Production53_481("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}