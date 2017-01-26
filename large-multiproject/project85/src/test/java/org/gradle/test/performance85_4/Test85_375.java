package org.gradle.test.performance85_4;

import static org.junit.Assert.*;

public class Test85_375 {
    private final Production85_375 production = new Production85_375("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}