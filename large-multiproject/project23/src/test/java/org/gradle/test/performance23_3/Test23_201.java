package org.gradle.test.performance23_3;

import static org.junit.Assert.*;

public class Test23_201 {
    private final Production23_201 production = new Production23_201("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}