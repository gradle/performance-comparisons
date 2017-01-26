package org.gradle.test.performance64_2;

import static org.junit.Assert.*;

public class Test64_160 {
    private final Production64_160 production = new Production64_160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}