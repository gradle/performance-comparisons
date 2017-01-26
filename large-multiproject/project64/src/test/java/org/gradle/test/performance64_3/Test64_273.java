package org.gradle.test.performance64_3;

import static org.junit.Assert.*;

public class Test64_273 {
    private final Production64_273 production = new Production64_273("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}