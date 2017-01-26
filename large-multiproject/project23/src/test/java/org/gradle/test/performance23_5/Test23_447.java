package org.gradle.test.performance23_5;

import static org.junit.Assert.*;

public class Test23_447 {
    private final Production23_447 production = new Production23_447("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}