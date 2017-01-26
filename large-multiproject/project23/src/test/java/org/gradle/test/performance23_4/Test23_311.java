package org.gradle.test.performance23_4;

import static org.junit.Assert.*;

public class Test23_311 {
    private final Production23_311 production = new Production23_311("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}