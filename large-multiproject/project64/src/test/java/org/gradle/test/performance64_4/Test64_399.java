package org.gradle.test.performance64_4;

import static org.junit.Assert.*;

public class Test64_399 {
    private final Production64_399 production = new Production64_399("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}