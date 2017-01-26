package org.gradle.test.performance23_3;

import static org.junit.Assert.*;

public class Test23_240 {
    private final Production23_240 production = new Production23_240("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}