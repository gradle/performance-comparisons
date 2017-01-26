package org.gradle.test.performance64_3;

import static org.junit.Assert.*;

public class Test64_275 {
    private final Production64_275 production = new Production64_275("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}