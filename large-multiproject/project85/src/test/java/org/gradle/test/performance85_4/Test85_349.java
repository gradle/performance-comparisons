package org.gradle.test.performance85_4;

import static org.junit.Assert.*;

public class Test85_349 {
    private final Production85_349 production = new Production85_349("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}