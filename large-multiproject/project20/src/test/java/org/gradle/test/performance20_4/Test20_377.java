package org.gradle.test.performance20_4;

import static org.junit.Assert.*;

public class Test20_377 {
    private final Production20_377 production = new Production20_377("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}