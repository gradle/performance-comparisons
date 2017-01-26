package org.gradle.test.performance64_2;

import static org.junit.Assert.*;

public class Test64_184 {
    private final Production64_184 production = new Production64_184("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}