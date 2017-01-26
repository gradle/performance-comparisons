package org.gradle.test.performance64_4;

import static org.junit.Assert.*;

public class Test64_359 {
    private final Production64_359 production = new Production64_359("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}