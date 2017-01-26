package org.gradle.test.performance64_5;

import static org.junit.Assert.*;

public class Test64_428 {
    private final Production64_428 production = new Production64_428("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}