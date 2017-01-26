package org.gradle.test.performance64_2;

import static org.junit.Assert.*;

public class Test64_116 {
    private final Production64_116 production = new Production64_116("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}