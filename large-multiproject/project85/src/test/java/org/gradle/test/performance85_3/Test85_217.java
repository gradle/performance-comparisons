package org.gradle.test.performance85_3;

import static org.junit.Assert.*;

public class Test85_217 {
    private final Production85_217 production = new Production85_217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}