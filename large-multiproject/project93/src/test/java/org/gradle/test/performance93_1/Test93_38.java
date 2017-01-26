package org.gradle.test.performance93_1;

import static org.junit.Assert.*;

public class Test93_38 {
    private final Production93_38 production = new Production93_38("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}