package org.gradle.test.performance25_1;

import static org.junit.Assert.*;

public class Test25_43 {
    private final Production25_43 production = new Production25_43("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}