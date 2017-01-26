package org.gradle.test.performance23_2;

import static org.junit.Assert.*;

public class Test23_113 {
    private final Production23_113 production = new Production23_113("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}