package org.gradle.test.performance64_4;

import static org.junit.Assert.*;

public class Test64_327 {
    private final Production64_327 production = new Production64_327("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}