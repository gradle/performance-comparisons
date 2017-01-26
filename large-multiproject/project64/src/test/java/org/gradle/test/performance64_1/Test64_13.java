package org.gradle.test.performance64_1;

import static org.junit.Assert.*;

public class Test64_13 {
    private final Production64_13 production = new Production64_13("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}