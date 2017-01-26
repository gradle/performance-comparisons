package org.gradle.test.performance74_1;

import static org.junit.Assert.*;

public class Test74_43 {
    private final Production74_43 production = new Production74_43("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}