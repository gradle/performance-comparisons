package org.gradle.test.performance53_1;

import static org.junit.Assert.*;

public class Test53_4 {
    private final Production53_4 production = new Production53_4("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}