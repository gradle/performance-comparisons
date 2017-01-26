package org.gradle.test.performance23_2;

import static org.junit.Assert.*;

public class Test23_133 {
    private final Production23_133 production = new Production23_133("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}