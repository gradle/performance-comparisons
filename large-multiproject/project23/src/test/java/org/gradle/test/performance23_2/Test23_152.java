package org.gradle.test.performance23_2;

import static org.junit.Assert.*;

public class Test23_152 {
    private final Production23_152 production = new Production23_152("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}