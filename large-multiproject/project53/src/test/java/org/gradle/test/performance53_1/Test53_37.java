package org.gradle.test.performance53_1;

import static org.junit.Assert.*;

public class Test53_37 {
    private final Production53_37 production = new Production53_37("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}