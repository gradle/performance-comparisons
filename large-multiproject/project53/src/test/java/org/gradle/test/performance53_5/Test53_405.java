package org.gradle.test.performance53_5;

import static org.junit.Assert.*;

public class Test53_405 {
    private final Production53_405 production = new Production53_405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}