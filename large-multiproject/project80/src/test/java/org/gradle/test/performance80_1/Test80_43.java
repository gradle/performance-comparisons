package org.gradle.test.performance80_1;

import static org.junit.Assert.*;

public class Test80_43 {
    private final Production80_43 production = new Production80_43("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}