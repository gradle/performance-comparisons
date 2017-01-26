package org.gradle.test.performance23_2;

import static org.junit.Assert.*;

public class Test23_160 {
    private final Production23_160 production = new Production23_160("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}