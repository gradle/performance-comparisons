package org.gradle.test.performance64_4;

import static org.junit.Assert.*;

public class Test64_384 {
    private final Production64_384 production = new Production64_384("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}