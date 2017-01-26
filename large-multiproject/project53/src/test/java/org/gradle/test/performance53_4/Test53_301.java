package org.gradle.test.performance53_4;

import static org.junit.Assert.*;

public class Test53_301 {
    private final Production53_301 production = new Production53_301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}