package org.gradle.test.performance23_4;

import static org.junit.Assert.*;

public class Test23_349 {
    private final Production23_349 production = new Production23_349("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}