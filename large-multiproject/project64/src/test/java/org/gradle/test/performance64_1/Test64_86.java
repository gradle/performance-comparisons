package org.gradle.test.performance64_1;

import static org.junit.Assert.*;

public class Test64_86 {
    private final Production64_86 production = new Production64_86("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}