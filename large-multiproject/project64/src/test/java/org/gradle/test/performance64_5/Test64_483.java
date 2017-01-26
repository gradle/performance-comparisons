package org.gradle.test.performance64_5;

import static org.junit.Assert.*;

public class Test64_483 {
    private final Production64_483 production = new Production64_483("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}