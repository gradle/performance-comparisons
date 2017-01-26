package org.gradle.test.performance64_5;

import static org.junit.Assert.*;

public class Test64_459 {
    private final Production64_459 production = new Production64_459("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}