package org.gradle.test.performance85_5;

import static org.junit.Assert.*;

public class Test85_455 {
    private final Production85_455 production = new Production85_455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}