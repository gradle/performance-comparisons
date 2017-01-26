package org.gradle.test.performance79_5;

import static org.junit.Assert.*;

public class Test79_440 {
    private final Production79_440 production = new Production79_440("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}