package org.gradle.test.performance64_2;

import static org.junit.Assert.*;

public class Test64_141 {
    private final Production64_141 production = new Production64_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}