package org.gradle.test.performance64_5;

import static org.junit.Assert.*;

public class Test64_429 {
    private final Production64_429 production = new Production64_429("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}