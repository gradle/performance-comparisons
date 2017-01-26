package org.gradle.test.performance85_3;

import static org.junit.Assert.*;

public class Test85_223 {
    private final Production85_223 production = new Production85_223("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}