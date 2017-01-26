package org.gradle.test.performance27_5;

import static org.junit.Assert.*;

public class Test27_441 {
    private final Production27_441 production = new Production27_441("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}