package org.gradle.test.performance14_5;

import static org.junit.Assert.*;

public class Test14_446 {
    private final Production14_446 production = new Production14_446("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}