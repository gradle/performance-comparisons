package org.gradle.test.performance93_1;

import static org.junit.Assert.*;

public class Test93_96 {
    private final Production93_96 production = new Production93_96("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}