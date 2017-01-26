package org.gradle.test.performance64_2;

import static org.junit.Assert.*;

public class Test64_118 {
    private final Production64_118 production = new Production64_118("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}