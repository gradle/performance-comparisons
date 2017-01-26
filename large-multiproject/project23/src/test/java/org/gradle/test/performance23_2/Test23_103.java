package org.gradle.test.performance23_2;

import static org.junit.Assert.*;

public class Test23_103 {
    private final Production23_103 production = new Production23_103("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}