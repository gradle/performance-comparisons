package org.gradle.test.performance79_5;

import static org.junit.Assert.*;

public class Test79_472 {
    private final Production79_472 production = new Production79_472("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}