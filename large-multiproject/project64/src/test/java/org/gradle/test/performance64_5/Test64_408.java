package org.gradle.test.performance64_5;

import static org.junit.Assert.*;

public class Test64_408 {
    private final Production64_408 production = new Production64_408("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}