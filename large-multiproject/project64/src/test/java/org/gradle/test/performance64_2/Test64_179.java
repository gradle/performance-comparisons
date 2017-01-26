package org.gradle.test.performance64_2;

import static org.junit.Assert.*;

public class Test64_179 {
    private final Production64_179 production = new Production64_179("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}