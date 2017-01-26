package org.gradle.test.performance33_5;

import static org.junit.Assert.*;

public class Test33_485 {
    private final Production33_485 production = new Production33_485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}