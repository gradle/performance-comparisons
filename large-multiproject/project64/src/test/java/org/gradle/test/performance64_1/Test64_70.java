package org.gradle.test.performance64_1;

import static org.junit.Assert.*;

public class Test64_70 {
    private final Production64_70 production = new Production64_70("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}