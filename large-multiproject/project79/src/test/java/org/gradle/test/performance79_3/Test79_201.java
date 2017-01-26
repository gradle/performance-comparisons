package org.gradle.test.performance79_3;

import static org.junit.Assert.*;

public class Test79_201 {
    private final Production79_201 production = new Production79_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}