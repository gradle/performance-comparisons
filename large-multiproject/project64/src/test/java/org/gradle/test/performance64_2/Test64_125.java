package org.gradle.test.performance64_2;

import static org.junit.Assert.*;

public class Test64_125 {
    private final Production64_125 production = new Production64_125("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}