package org.gradle.test.performance27_5;

import static org.junit.Assert.*;

public class Test27_455 {
    private final Production27_455 production = new Production27_455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}