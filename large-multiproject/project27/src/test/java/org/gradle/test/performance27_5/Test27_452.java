package org.gradle.test.performance27_5;

import static org.junit.Assert.*;

public class Test27_452 {
    private final Production27_452 production = new Production27_452("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}