package org.gradle.test.performance23_3;

import static org.junit.Assert.*;

public class Test23_295 {
    private final Production23_295 production = new Production23_295("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}