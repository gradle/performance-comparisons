package org.gradle.test.performance93_3;

import static org.junit.Assert.*;

public class Test93_294 {
    private final Production93_294 production = new Production93_294("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}