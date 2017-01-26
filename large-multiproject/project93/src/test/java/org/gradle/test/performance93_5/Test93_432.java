package org.gradle.test.performance93_5;

import static org.junit.Assert.*;

public class Test93_432 {
    private final Production93_432 production = new Production93_432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}