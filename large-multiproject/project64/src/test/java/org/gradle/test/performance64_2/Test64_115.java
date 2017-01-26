package org.gradle.test.performance64_2;

import static org.junit.Assert.*;

public class Test64_115 {
    private final Production64_115 production = new Production64_115("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}