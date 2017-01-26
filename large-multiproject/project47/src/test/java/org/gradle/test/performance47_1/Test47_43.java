package org.gradle.test.performance47_1;

import static org.junit.Assert.*;

public class Test47_43 {
    private final Production47_43 production = new Production47_43("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}