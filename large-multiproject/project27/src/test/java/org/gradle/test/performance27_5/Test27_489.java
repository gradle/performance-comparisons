package org.gradle.test.performance27_5;

import static org.junit.Assert.*;

public class Test27_489 {
    private final Production27_489 production = new Production27_489("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}