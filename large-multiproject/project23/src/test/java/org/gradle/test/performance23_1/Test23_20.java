package org.gradle.test.performance23_1;

import static org.junit.Assert.*;

public class Test23_20 {
    private final Production23_20 production = new Production23_20("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}