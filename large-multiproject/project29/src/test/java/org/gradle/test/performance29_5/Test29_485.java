package org.gradle.test.performance29_5;

import static org.junit.Assert.*;

public class Test29_485 {
    private final Production29_485 production = new Production29_485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}