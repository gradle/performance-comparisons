package org.gradle.test.performance64_3;

import static org.junit.Assert.*;

public class Test64_292 {
    private final Production64_292 production = new Production64_292("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}