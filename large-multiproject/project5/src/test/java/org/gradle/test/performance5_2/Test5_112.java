package org.gradle.test.performance5_2;

import static org.junit.Assert.*;

public class Test5_112 {
    private final Production5_112 production = new Production5_112("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}