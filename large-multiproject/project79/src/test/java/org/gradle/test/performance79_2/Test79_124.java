package org.gradle.test.performance79_2;

import static org.junit.Assert.*;

public class Test79_124 {
    private final Production79_124 production = new Production79_124("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}