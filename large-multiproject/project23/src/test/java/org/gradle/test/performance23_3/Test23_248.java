package org.gradle.test.performance23_3;

import static org.junit.Assert.*;

public class Test23_248 {
    private final Production23_248 production = new Production23_248("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}