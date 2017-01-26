package org.gradle.test.performance79_2;

import static org.junit.Assert.*;

public class Test79_193 {
    private final Production79_193 production = new Production79_193("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}