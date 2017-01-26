package org.gradle.test.performance93_1;

import static org.junit.Assert.*;

public class Test93_28 {
    private final Production93_28 production = new Production93_28("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}