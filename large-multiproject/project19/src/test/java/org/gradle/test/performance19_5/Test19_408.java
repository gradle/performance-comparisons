package org.gradle.test.performance19_5;

import static org.junit.Assert.*;

public class Test19_408 {
    private final Production19_408 production = new Production19_408("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}