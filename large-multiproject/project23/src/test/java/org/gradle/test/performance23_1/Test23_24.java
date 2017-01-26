package org.gradle.test.performance23_1;

import static org.junit.Assert.*;

public class Test23_24 {
    private final Production23_24 production = new Production23_24("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}