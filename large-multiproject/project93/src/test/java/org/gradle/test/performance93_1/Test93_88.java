package org.gradle.test.performance93_1;

import static org.junit.Assert.*;

public class Test93_88 {
    private final Production93_88 production = new Production93_88("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}