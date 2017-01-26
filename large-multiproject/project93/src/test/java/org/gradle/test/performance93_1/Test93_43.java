package org.gradle.test.performance93_1;

import static org.junit.Assert.*;

public class Test93_43 {
    private final Production93_43 production = new Production93_43("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}