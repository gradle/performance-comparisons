package org.gradle.test.performance27_2;

import static org.junit.Assert.*;

public class Test27_177 {
    private final Production27_177 production = new Production27_177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}