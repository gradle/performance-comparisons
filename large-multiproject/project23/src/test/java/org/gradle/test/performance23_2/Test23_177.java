package org.gradle.test.performance23_2;

import static org.junit.Assert.*;

public class Test23_177 {
    private final Production23_177 production = new Production23_177("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}