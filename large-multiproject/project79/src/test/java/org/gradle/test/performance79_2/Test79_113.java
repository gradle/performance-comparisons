package org.gradle.test.performance79_2;

import static org.junit.Assert.*;

public class Test79_113 {
    private final Production79_113 production = new Production79_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}