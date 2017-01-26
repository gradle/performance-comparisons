package org.gradle.test.performance97_4;

import static org.junit.Assert.*;

public class Test97_308 {
    private final Production97_308 production = new Production97_308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}