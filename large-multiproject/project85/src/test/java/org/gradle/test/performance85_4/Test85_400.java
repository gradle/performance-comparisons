package org.gradle.test.performance85_4;

import static org.junit.Assert.*;

public class Test85_400 {
    private final Production85_400 production = new Production85_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}