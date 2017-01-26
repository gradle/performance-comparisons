package org.gradle.test.performance98_1;

import static org.junit.Assert.*;

public class Test98_43 {
    private final Production98_43 production = new Production98_43("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}