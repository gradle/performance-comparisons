package org.gradle.test.performance23_2;

import static org.junit.Assert.*;

public class Test23_118 {
    private final Production23_118 production = new Production23_118("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}