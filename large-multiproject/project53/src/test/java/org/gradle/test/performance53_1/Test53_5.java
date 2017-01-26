package org.gradle.test.performance53_1;

import static org.junit.Assert.*;

public class Test53_5 {
    private final Production53_5 production = new Production53_5("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}