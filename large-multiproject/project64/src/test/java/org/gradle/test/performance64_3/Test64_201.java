package org.gradle.test.performance64_3;

import static org.junit.Assert.*;

public class Test64_201 {
    private final Production64_201 production = new Production64_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}