package org.gradle.test.performance18_1;

import static org.junit.Assert.*;

public class Test18_43 {
    private final Production18_43 production = new Production18_43("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}