package org.gradle.test.performance85_5;

import static org.junit.Assert.*;

public class Test85_478 {
    private final Production85_478 production = new Production85_478("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}