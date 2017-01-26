package org.gradle.test.performance64_1;

import static org.junit.Assert.*;

public class Test64_22 {
    private final Production64_22 production = new Production64_22("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}