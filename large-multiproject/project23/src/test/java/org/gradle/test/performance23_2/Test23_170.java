package org.gradle.test.performance23_2;

import static org.junit.Assert.*;

public class Test23_170 {
    private final Production23_170 production = new Production23_170("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}