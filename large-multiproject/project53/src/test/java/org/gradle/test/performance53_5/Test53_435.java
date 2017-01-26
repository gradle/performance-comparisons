package org.gradle.test.performance53_5;

import static org.junit.Assert.*;

public class Test53_435 {
    private final Production53_435 production = new Production53_435("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}