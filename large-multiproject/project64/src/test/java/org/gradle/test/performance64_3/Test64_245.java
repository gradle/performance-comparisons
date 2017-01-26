package org.gradle.test.performance64_3;

import static org.junit.Assert.*;

public class Test64_245 {
    private final Production64_245 production = new Production64_245("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}