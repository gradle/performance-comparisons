package org.gradle.test.performance97_5;

import static org.junit.Assert.*;

public class Test97_485 {
    private final Production97_485 production = new Production97_485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}