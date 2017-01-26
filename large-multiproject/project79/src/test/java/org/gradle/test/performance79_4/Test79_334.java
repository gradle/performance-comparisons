package org.gradle.test.performance79_4;

import static org.junit.Assert.*;

public class Test79_334 {
    private final Production79_334 production = new Production79_334("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}