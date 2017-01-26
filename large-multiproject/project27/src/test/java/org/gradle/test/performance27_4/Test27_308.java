package org.gradle.test.performance27_4;

import static org.junit.Assert.*;

public class Test27_308 {
    private final Production27_308 production = new Production27_308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}