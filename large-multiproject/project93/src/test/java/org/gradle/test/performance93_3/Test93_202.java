package org.gradle.test.performance93_3;

import static org.junit.Assert.*;

public class Test93_202 {
    private final Production93_202 production = new Production93_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}