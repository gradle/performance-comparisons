package org.gradle.test.performance53_1;

import static org.junit.Assert.*;

public class Test53_63 {
    private final Production53_63 production = new Production53_63("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}