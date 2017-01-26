package org.gradle.test.performance64_4;

import static org.junit.Assert.*;

public class Test64_312 {
    private final Production64_312 production = new Production64_312("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}