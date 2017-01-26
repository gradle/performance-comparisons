package org.gradle.test.performance23_5;

import static org.junit.Assert.*;

public class Test23_412 {
    private final Production23_412 production = new Production23_412("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}