package org.gradle.test.performance64_4;

import static org.junit.Assert.*;

public class Test64_375 {
    private final Production64_375 production = new Production64_375("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}