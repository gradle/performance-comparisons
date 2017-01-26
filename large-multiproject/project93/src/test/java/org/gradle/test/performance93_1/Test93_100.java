package org.gradle.test.performance93_1;

import static org.junit.Assert.*;

public class Test93_100 {
    private final Production93_100 production = new Production93_100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}