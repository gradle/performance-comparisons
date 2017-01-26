package org.gradle.test.performance53_5;

import static org.junit.Assert.*;

public class Test53_424 {
    private final Production53_424 production = new Production53_424("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}