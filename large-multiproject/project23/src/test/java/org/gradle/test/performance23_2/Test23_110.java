package org.gradle.test.performance23_2;

import static org.junit.Assert.*;

public class Test23_110 {
    private final Production23_110 production = new Production23_110("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}