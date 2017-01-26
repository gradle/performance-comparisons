package org.gradle.test.performance85_2;

import static org.junit.Assert.*;

public class Test85_130 {
    private final Production85_130 production = new Production85_130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}