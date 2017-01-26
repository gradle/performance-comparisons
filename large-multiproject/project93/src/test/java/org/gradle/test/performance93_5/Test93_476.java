package org.gradle.test.performance93_5;

import static org.junit.Assert.*;

public class Test93_476 {
    private final Production93_476 production = new Production93_476("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}