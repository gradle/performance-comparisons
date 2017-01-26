package org.gradle.test.performance35_1;

import static org.junit.Assert.*;

public class Test35_43 {
    private final Production35_43 production = new Production35_43("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}