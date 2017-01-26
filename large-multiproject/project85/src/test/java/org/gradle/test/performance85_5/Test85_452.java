package org.gradle.test.performance85_5;

import static org.junit.Assert.*;

public class Test85_452 {
    private final Production85_452 production = new Production85_452("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}