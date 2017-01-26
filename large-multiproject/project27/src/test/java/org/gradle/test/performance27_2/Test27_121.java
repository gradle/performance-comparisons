package org.gradle.test.performance27_2;

import static org.junit.Assert.*;

public class Test27_121 {
    private final Production27_121 production = new Production27_121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}