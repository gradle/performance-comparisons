package org.gradle.test.performance64_1;

import static org.junit.Assert.*;

public class Test64_94 {
    private final Production64_94 production = new Production64_94("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}