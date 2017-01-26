package org.gradle.test.performance27_5;

import static org.junit.Assert.*;

public class Test27_470 {
    private final Production27_470 production = new Production27_470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}