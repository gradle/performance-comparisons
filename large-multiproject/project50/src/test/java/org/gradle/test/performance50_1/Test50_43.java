package org.gradle.test.performance50_1;

import static org.junit.Assert.*;

public class Test50_43 {
    private final Production50_43 production = new Production50_43("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}