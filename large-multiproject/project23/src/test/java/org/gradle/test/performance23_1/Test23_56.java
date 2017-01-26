package org.gradle.test.performance23_1;

import static org.junit.Assert.*;

public class Test23_56 {
    private final Production23_56 production = new Production23_56("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}