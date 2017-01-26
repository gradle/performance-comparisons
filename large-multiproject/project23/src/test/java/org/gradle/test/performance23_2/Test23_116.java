package org.gradle.test.performance23_2;

import static org.junit.Assert.*;

public class Test23_116 {
    private final Production23_116 production = new Production23_116("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}