package org.gradle.test.performance23_2;

import static org.junit.Assert.*;

public class Test23_191 {
    private final Production23_191 production = new Production23_191("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}