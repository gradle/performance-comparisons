package org.gradle.test.performance15_4;

import static org.junit.Assert.*;

public class Test15_308 {
    private final Production15_308 production = new Production15_308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}