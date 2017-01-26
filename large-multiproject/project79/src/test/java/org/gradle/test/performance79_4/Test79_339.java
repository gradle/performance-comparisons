package org.gradle.test.performance79_4;

import static org.junit.Assert.*;

public class Test79_339 {
    private final Production79_339 production = new Production79_339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}