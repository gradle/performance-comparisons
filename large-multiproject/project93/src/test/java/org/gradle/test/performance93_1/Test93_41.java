package org.gradle.test.performance93_1;

import static org.junit.Assert.*;

public class Test93_41 {
    private final Production93_41 production = new Production93_41("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}