package org.gradle.test.performance53_5;

import static org.junit.Assert.*;

public class Test53_419 {
    private final Production53_419 production = new Production53_419("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}