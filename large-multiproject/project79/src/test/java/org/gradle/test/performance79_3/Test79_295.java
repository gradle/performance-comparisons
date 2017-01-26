package org.gradle.test.performance79_3;

import static org.junit.Assert.*;

public class Test79_295 {
    private final Production79_295 production = new Production79_295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}