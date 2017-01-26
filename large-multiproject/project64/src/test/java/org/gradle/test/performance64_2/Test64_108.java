package org.gradle.test.performance64_2;

import static org.junit.Assert.*;

public class Test64_108 {
    private final Production64_108 production = new Production64_108("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}