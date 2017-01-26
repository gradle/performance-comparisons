package org.gradle.test.performance64_5;

import static org.junit.Assert.*;

public class Test64_473 {
    private final Production64_473 production = new Production64_473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}