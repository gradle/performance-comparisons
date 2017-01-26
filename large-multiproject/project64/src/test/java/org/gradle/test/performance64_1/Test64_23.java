package org.gradle.test.performance64_1;

import static org.junit.Assert.*;

public class Test64_23 {
    private final Production64_23 production = new Production64_23("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}