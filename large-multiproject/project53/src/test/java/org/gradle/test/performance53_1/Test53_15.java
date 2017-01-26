package org.gradle.test.performance53_1;

import static org.junit.Assert.*;

public class Test53_15 {
    private final Production53_15 production = new Production53_15("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}