package org.gradle.test.performance11_5;

import static org.junit.Assert.*;

public class Test11_485 {
    private final Production11_485 production = new Production11_485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}