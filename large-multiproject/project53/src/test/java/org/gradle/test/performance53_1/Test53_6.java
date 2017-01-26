package org.gradle.test.performance53_1;

import static org.junit.Assert.*;

public class Test53_6 {
    private final Production53_6 production = new Production53_6("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}