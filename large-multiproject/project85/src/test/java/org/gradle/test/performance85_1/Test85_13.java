package org.gradle.test.performance85_1;

import static org.junit.Assert.*;

public class Test85_13 {
    private final Production85_13 production = new Production85_13("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}