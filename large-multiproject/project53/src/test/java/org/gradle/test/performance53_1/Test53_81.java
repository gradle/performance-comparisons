package org.gradle.test.performance53_1;

import static org.junit.Assert.*;

public class Test53_81 {
    private final Production53_81 production = new Production53_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}