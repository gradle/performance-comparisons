package org.gradle.test.performance93_1;

import static org.junit.Assert.*;

public class Test93_34 {
    private final Production93_34 production = new Production93_34("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}