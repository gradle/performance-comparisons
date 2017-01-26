package org.gradle.test.performance64_5;

import static org.junit.Assert.*;

public class Test64_412 {
    private final Production64_412 production = new Production64_412("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}