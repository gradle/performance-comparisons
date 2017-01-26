package org.gradle.test.performance23_4;

import static org.junit.Assert.*;

public class Test23_340 {
    private final Production23_340 production = new Production23_340("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}