package org.gradle.test.performance53_5;

import static org.junit.Assert.*;

public class Test53_488 {
    private final Production53_488 production = new Production53_488("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}