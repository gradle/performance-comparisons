package org.gradle.test.performance79_3;

import static org.junit.Assert.*;

public class Test79_291 {
    private final Production79_291 production = new Production79_291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}