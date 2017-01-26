package org.gradle.test.performance71_5;

import static org.junit.Assert.*;

public class Test71_485 {
    private final Production71_485 production = new Production71_485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}