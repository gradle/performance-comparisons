package org.gradle.test.performance64_5;

import static org.junit.Assert.*;

public class Test64_487 {
    private final Production64_487 production = new Production64_487("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}