package org.gradle.test.performance79_2;

import static org.junit.Assert.*;

public class Test79_180 {
    private final Production79_180 production = new Production79_180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}