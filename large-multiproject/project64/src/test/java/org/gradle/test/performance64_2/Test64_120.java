package org.gradle.test.performance64_2;

import static org.junit.Assert.*;

public class Test64_120 {
    private final Production64_120 production = new Production64_120("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}