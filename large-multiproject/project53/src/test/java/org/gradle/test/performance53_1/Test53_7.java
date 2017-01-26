package org.gradle.test.performance53_1;

import static org.junit.Assert.*;

public class Test53_7 {
    private final Production53_7 production = new Production53_7("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}