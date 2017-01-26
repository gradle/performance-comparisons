package org.gradle.test.performance64_2;

import static org.junit.Assert.*;

public class Test64_193 {
    private final Production64_193 production = new Production64_193("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}