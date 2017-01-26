package org.gradle.test.performance53_1;

import static org.junit.Assert.*;

public class Test53_1 {
    private final Production53_1 production = new Production53_1("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}