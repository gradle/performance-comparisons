package org.gradle.test.performance85_3;

import static org.junit.Assert.*;

public class Test85_232 {
    private final Production85_232 production = new Production85_232("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}