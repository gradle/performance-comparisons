package org.gradle.test.performance64_2;

import static org.junit.Assert.*;

public class Test64_130 {
    private final Production64_130 production = new Production64_130("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}