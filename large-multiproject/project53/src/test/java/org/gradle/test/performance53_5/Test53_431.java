package org.gradle.test.performance53_5;

import static org.junit.Assert.*;

public class Test53_431 {
    private final Production53_431 production = new Production53_431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}