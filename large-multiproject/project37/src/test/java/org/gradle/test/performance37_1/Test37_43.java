package org.gradle.test.performance37_1;

import static org.junit.Assert.*;

public class Test37_43 {
    private final Production37_43 production = new Production37_43("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}