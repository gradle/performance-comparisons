package org.gradle.test.performance79_2;

import static org.junit.Assert.*;

public class Test79_137 {
    private final Production79_137 production = new Production79_137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}