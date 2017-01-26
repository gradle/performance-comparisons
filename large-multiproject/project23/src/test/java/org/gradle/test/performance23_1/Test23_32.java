package org.gradle.test.performance23_1;

import static org.junit.Assert.*;

public class Test23_32 {
    private final Production23_32 production = new Production23_32("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}