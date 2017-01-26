package org.gradle.test.performance27_2;

import static org.junit.Assert.*;

public class Test27_179 {
    private final Production27_179 production = new Production27_179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}