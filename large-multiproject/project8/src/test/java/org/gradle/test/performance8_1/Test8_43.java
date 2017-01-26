package org.gradle.test.performance8_1;

import static org.junit.Assert.*;

public class Test8_43 {
    private final Production8_43 production = new Production8_43("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}