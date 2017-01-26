package org.gradle.test.performance64_3;

import static org.junit.Assert.*;

public class Test64_206 {
    private final Production64_206 production = new Production64_206("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}