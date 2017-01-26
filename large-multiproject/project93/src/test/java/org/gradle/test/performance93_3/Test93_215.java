package org.gradle.test.performance93_3;

import static org.junit.Assert.*;

public class Test93_215 {
    private final Production93_215 production = new Production93_215("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}