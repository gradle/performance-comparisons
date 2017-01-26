package org.gradle.test.performance93_4;

import static org.junit.Assert.*;

public class Test93_358 {
    private final Production93_358 production = new Production93_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}