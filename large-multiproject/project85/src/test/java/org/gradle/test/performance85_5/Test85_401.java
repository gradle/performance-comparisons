package org.gradle.test.performance85_5;

import static org.junit.Assert.*;

public class Test85_401 {
    private final Production85_401 production = new Production85_401("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}