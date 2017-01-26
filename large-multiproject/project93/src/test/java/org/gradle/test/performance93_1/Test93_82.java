package org.gradle.test.performance93_1;

import static org.junit.Assert.*;

public class Test93_82 {
    private final Production93_82 production = new Production93_82("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}