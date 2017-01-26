package org.gradle.test.performance64_5;

import static org.junit.Assert.*;

public class Test64_402 {
    private final Production64_402 production = new Production64_402("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}