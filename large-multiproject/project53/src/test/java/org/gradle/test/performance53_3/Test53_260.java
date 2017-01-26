package org.gradle.test.performance53_3;

import static org.junit.Assert.*;

public class Test53_260 {
    private final Production53_260 production = new Production53_260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}