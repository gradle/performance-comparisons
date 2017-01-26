package org.gradle.test.performance27_5;

import static org.junit.Assert.*;

public class Test27_467 {
    private final Production27_467 production = new Production27_467("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}