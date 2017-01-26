package org.gradle.test.performance23_5;

import static org.junit.Assert.*;

public class Test23_470 {
    private final Production23_470 production = new Production23_470("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}