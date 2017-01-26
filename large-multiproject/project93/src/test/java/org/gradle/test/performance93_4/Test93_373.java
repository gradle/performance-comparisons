package org.gradle.test.performance93_4;

import static org.junit.Assert.*;

public class Test93_373 {
    private final Production93_373 production = new Production93_373("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}