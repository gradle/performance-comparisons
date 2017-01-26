package org.gradle.test.performance64_1;

import static org.junit.Assert.*;

public class Test64_21 {
    private final Production64_21 production = new Production64_21("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}