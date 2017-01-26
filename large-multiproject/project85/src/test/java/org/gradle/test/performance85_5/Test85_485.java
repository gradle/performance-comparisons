package org.gradle.test.performance85_5;

import static org.junit.Assert.*;

public class Test85_485 {
    private final Production85_485 production = new Production85_485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}