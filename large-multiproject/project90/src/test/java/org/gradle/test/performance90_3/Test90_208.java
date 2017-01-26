package org.gradle.test.performance90_3;

import static org.junit.Assert.*;

public class Test90_208 {
    private final Production90_208 production = new Production90_208("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}