package org.gradle.test.performance79_4;

import static org.junit.Assert.*;

public class Test79_371 {
    private final Production79_371 production = new Production79_371("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}