package org.gradle.test.performance85_2;

import static org.junit.Assert.*;

public class Test85_177 {
    private final Production85_177 production = new Production85_177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}