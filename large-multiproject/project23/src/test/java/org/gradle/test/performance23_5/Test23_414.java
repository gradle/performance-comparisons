package org.gradle.test.performance23_5;

import static org.junit.Assert.*;

public class Test23_414 {
    private final Production23_414 production = new Production23_414("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}