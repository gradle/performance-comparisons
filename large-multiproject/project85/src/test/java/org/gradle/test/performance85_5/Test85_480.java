package org.gradle.test.performance85_5;

import static org.junit.Assert.*;

public class Test85_480 {
    private final Production85_480 production = new Production85_480("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}