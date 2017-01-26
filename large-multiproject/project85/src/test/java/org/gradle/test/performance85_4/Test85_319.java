package org.gradle.test.performance85_4;

import static org.junit.Assert.*;

public class Test85_319 {
    private final Production85_319 production = new Production85_319("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}