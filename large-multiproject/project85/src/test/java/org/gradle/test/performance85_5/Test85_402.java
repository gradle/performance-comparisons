package org.gradle.test.performance85_5;

import static org.junit.Assert.*;

public class Test85_402 {
    private final Production85_402 production = new Production85_402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}