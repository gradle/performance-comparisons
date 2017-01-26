package org.gradle.test.performance53_1;

import static org.junit.Assert.*;

public class Test53_46 {
    private final Production53_46 production = new Production53_46("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}