package org.gradle.test.performance23_5;

import static org.junit.Assert.*;

public class Test23_415 {
    private final Production23_415 production = new Production23_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}