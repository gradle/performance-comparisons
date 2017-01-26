package org.gradle.test.performance79_1;

import static org.junit.Assert.*;

public class Test79_79 {
    private final Production79_79 production = new Production79_79("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}