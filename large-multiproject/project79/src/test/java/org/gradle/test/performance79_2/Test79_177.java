package org.gradle.test.performance79_2;

import static org.junit.Assert.*;

public class Test79_177 {
    private final Production79_177 production = new Production79_177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}