package org.gradle.test.performance64_3;

import static org.junit.Assert.*;

public class Test64_205 {
    private final Production64_205 production = new Production64_205("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}