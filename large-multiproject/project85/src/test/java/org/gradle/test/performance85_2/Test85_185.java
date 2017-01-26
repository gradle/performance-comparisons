package org.gradle.test.performance85_2;

import static org.junit.Assert.*;

public class Test85_185 {
    private final Production85_185 production = new Production85_185("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}