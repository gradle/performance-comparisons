package org.gradle.test.performance73_4;

import static org.junit.Assert.*;

public class Test73_308 {
    private final Production73_308 production = new Production73_308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}