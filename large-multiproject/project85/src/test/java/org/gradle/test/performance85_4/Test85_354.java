package org.gradle.test.performance85_4;

import static org.junit.Assert.*;

public class Test85_354 {
    private final Production85_354 production = new Production85_354("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}