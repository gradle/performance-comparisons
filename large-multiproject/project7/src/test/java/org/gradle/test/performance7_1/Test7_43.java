package org.gradle.test.performance7_1;

import static org.junit.Assert.*;

public class Test7_43 {
    private final Production7_43 production = new Production7_43("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}