package org.gradle.test.performance64_3;

import static org.junit.Assert.*;

public class Test64_250 {
    private final Production64_250 production = new Production64_250("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}