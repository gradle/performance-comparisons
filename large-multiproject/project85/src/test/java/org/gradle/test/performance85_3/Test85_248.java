package org.gradle.test.performance85_3;

import static org.junit.Assert.*;

public class Test85_248 {
    private final Production85_248 production = new Production85_248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}