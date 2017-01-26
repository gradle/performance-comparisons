package org.gradle.test.performance64_2;

import static org.junit.Assert.*;

public class Test64_198 {
    private final Production64_198 production = new Production64_198("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}