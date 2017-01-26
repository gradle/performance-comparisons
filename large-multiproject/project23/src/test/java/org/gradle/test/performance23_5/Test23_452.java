package org.gradle.test.performance23_5;

import static org.junit.Assert.*;

public class Test23_452 {
    private final Production23_452 production = new Production23_452("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}