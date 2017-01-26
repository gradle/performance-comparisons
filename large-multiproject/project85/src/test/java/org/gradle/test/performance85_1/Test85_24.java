package org.gradle.test.performance85_1;

import static org.junit.Assert.*;

public class Test85_24 {
    private final Production85_24 production = new Production85_24("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}