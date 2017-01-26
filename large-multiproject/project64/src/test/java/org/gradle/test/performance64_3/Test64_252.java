package org.gradle.test.performance64_3;

import static org.junit.Assert.*;

public class Test64_252 {
    private final Production64_252 production = new Production64_252("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}