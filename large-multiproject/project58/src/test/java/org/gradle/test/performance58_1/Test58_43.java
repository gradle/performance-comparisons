package org.gradle.test.performance58_1;

import static org.junit.Assert.*;

public class Test58_43 {
    private final Production58_43 production = new Production58_43("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}