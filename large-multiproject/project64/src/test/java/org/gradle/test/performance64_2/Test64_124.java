package org.gradle.test.performance64_2;

import static org.junit.Assert.*;

public class Test64_124 {
    private final Production64_124 production = new Production64_124("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}