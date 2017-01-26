package org.gradle.test.performance64_1;

import static org.junit.Assert.*;

public class Test64_79 {
    private final Production64_79 production = new Production64_79("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}