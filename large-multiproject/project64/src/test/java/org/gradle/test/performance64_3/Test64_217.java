package org.gradle.test.performance64_3;

import static org.junit.Assert.*;

public class Test64_217 {
    private final Production64_217 production = new Production64_217("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}