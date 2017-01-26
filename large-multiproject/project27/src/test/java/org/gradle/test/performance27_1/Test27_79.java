package org.gradle.test.performance27_1;

import static org.junit.Assert.*;

public class Test27_79 {
    private final Production27_79 production = new Production27_79("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}