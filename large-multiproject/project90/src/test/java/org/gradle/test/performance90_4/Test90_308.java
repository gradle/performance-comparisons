package org.gradle.test.performance90_4;

import static org.junit.Assert.*;

public class Test90_308 {
    private final Production90_308 production = new Production90_308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}