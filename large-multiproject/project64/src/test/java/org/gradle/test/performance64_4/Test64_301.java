package org.gradle.test.performance64_4;

import static org.junit.Assert.*;

public class Test64_301 {
    private final Production64_301 production = new Production64_301("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}