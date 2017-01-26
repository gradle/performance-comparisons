package org.gradle.test.performance23_3;

import static org.junit.Assert.*;

public class Test23_278 {
    private final Production23_278 production = new Production23_278("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}