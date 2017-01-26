package org.gradle.test.performance85_3;

import static org.junit.Assert.*;

public class Test85_250 {
    private final Production85_250 production = new Production85_250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}