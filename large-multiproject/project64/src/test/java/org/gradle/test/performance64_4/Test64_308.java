package org.gradle.test.performance64_4;

import static org.junit.Assert.*;

public class Test64_308 {
    private final Production64_308 production = new Production64_308("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}