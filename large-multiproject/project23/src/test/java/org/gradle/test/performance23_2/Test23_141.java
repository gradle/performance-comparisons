package org.gradle.test.performance23_2;

import static org.junit.Assert.*;

public class Test23_141 {
    private final Production23_141 production = new Production23_141("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}