package org.gradle.test.performance79_4;

import static org.junit.Assert.*;

public class Test79_377 {
    private final Production79_377 production = new Production79_377("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}