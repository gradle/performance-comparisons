package org.gradle.test.performance23_1;

import static org.junit.Assert.*;

public class Test23_23 {
    private final Production23_23 production = new Production23_23("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}