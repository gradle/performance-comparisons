package org.gradle.test.performance5_1;

import static org.junit.Assert.*;

public class Test5_43 {
    private final Production5_43 production = new Production5_43("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}