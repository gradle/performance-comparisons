package org.gradle.test.performance23_5;

import static org.junit.Assert.*;

public class Test23_485 {
    private final Production23_485 production = new Production23_485("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}