package org.gradle.test.performance53_5;

import static org.junit.Assert.*;

public class Test53_464 {
    private final Production53_464 production = new Production53_464("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}