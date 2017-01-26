package org.gradle.test.performance53_2;

import static org.junit.Assert.*;

public class Test53_193 {
    private final Production53_193 production = new Production53_193("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}