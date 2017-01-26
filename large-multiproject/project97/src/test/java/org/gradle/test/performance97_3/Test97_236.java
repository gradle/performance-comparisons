package org.gradle.test.performance97_3;

import static org.junit.Assert.*;

public class Test97_236 {
    private final Production97_236 production = new Production97_236("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}