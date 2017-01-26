package org.gradle.test.performance53_3;

import static org.junit.Assert.*;

public class Test53_213 {
    private final Production53_213 production = new Production53_213("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}