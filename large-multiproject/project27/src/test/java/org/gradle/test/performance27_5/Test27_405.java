package org.gradle.test.performance27_5;

import static org.junit.Assert.*;

public class Test27_405 {
    private final Production27_405 production = new Production27_405("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}