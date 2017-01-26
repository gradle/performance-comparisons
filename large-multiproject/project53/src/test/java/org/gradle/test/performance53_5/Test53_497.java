package org.gradle.test.performance53_5;

import static org.junit.Assert.*;

public class Test53_497 {
    private final Production53_497 production = new Production53_497("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}