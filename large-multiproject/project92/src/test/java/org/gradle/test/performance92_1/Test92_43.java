package org.gradle.test.performance92_1;

import static org.junit.Assert.*;

public class Test92_43 {
    private final Production92_43 production = new Production92_43("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}