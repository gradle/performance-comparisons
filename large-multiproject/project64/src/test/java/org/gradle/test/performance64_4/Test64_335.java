package org.gradle.test.performance64_4;

import static org.junit.Assert.*;

public class Test64_335 {
    private final Production64_335 production = new Production64_335("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}