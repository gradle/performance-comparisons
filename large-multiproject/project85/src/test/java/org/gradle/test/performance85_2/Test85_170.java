package org.gradle.test.performance85_2;

import static org.junit.Assert.*;

public class Test85_170 {
    private final Production85_170 production = new Production85_170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}