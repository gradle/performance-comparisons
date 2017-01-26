package org.gradle.test.performance64_5;

import static org.junit.Assert.*;

public class Test64_493 {
    private final Production64_493 production = new Production64_493("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}