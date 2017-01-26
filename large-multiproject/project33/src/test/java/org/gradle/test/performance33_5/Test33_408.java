package org.gradle.test.performance33_5;

import static org.junit.Assert.*;

public class Test33_408 {
    private final Production33_408 production = new Production33_408("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}