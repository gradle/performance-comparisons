package org.gradle.test.performance53_1;

import static org.junit.Assert.*;

public class Test53_39 {
    private final Production53_39 production = new Production53_39("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}