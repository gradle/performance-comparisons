package org.gradle.test.performance53_5;

import static org.junit.Assert.*;

public class Test53_468 {
    private final Production53_468 production = new Production53_468("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}