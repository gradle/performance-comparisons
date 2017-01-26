package org.gradle.test.performance27_2;

import static org.junit.Assert.*;

public class Test27_113 {
    private final Production27_113 production = new Production27_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}