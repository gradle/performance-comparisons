package org.gradle.test.performance79_2;

import static org.junit.Assert.*;

public class Test79_149 {
    private final Production79_149 production = new Production79_149("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}