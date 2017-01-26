package org.gradle.test.performance23_3;

import static org.junit.Assert.*;

public class Test23_256 {
    private final Production23_256 production = new Production23_256("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}