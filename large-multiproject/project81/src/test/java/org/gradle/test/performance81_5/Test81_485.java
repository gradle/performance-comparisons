package org.gradle.test.performance81_5;

import static org.junit.Assert.*;

public class Test81_485 {
    private final Production81_485 production = new Production81_485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}