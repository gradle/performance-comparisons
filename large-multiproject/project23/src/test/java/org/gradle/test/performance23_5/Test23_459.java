package org.gradle.test.performance23_5;

import static org.junit.Assert.*;

public class Test23_459 {
    private final Production23_459 production = new Production23_459("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}