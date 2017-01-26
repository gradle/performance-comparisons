package org.gradle.test.performance23_4;

import static org.junit.Assert.*;

public class Test23_360 {
    private final Production23_360 production = new Production23_360("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}