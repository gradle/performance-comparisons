package org.gradle.test.performance85_2;

import static org.junit.Assert.*;

public class Test85_153 {
    private final Production85_153 production = new Production85_153("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}