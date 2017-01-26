package org.gradle.test.performance53_1;

import static org.junit.Assert.*;

public class Test53_48 {
    private final Production53_48 production = new Production53_48("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}