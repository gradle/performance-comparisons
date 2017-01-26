package org.gradle.test.performance93_1;

import static org.junit.Assert.*;

public class Test93_98 {
    private final Production93_98 production = new Production93_98("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}