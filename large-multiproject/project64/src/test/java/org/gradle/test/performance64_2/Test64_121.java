package org.gradle.test.performance64_2;

import static org.junit.Assert.*;

public class Test64_121 {
    private final Production64_121 production = new Production64_121("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}