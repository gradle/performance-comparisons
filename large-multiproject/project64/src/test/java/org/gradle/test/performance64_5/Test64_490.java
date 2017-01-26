package org.gradle.test.performance64_5;

import static org.junit.Assert.*;

public class Test64_490 {
    private final Production64_490 production = new Production64_490("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}