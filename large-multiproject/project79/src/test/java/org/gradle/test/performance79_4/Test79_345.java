package org.gradle.test.performance79_4;

import static org.junit.Assert.*;

public class Test79_345 {
    private final Production79_345 production = new Production79_345("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}