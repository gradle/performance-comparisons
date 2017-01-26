package org.gradle.test.performance79_4;

import static org.junit.Assert.*;

public class Test79_308 {
    private final Production79_308 production = new Production79_308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}