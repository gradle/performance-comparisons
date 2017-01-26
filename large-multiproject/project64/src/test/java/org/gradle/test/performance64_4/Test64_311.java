package org.gradle.test.performance64_4;

import static org.junit.Assert.*;

public class Test64_311 {
    private final Production64_311 production = new Production64_311("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}