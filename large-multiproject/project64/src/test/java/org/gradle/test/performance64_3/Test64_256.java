package org.gradle.test.performance64_3;

import static org.junit.Assert.*;

public class Test64_256 {
    private final Production64_256 production = new Production64_256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}