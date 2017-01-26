package org.gradle.test.performance64_3;

import static org.junit.Assert.*;

public class Test64_236 {
    private final Production64_236 production = new Production64_236("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}