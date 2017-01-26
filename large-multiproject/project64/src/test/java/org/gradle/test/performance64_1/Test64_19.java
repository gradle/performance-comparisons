package org.gradle.test.performance64_1;

import static org.junit.Assert.*;

public class Test64_19 {
    private final Production64_19 production = new Production64_19("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}