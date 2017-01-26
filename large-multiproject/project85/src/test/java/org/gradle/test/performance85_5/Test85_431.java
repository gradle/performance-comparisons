package org.gradle.test.performance85_5;

import static org.junit.Assert.*;

public class Test85_431 {
    private final Production85_431 production = new Production85_431("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}