package org.gradle.test.performance27_2;

import static org.junit.Assert.*;

public class Test27_103 {
    private final Production27_103 production = new Production27_103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}