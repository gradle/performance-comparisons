package org.gradle.test.performance23_1;

import static org.junit.Assert.*;

public class Test23_79 {
    private final Production23_79 production = new Production23_79("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}