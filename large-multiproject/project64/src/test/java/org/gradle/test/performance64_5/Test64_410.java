package org.gradle.test.performance64_5;

import static org.junit.Assert.*;

public class Test64_410 {
    private final Production64_410 production = new Production64_410("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}