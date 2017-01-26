package org.gradle.test.performance20_1;

import static org.junit.Assert.*;

public class Test20_43 {
    private final Production20_43 production = new Production20_43("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}