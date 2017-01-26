package org.gradle.test.performance23_2;

import static org.junit.Assert.*;

public class Test23_174 {
    private final Production23_174 production = new Production23_174("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}