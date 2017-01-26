package org.gradle.test.performance23_4;

import static org.junit.Assert.*;

public class Test23_380 {
    private final Production23_380 production = new Production23_380("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}