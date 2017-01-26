package org.gradle.test.performance85_2;

import static org.junit.Assert.*;

public class Test85_169 {
    private final Production85_169 production = new Production85_169("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}