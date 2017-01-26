package org.gradle.test.performance23_4;

import static org.junit.Assert.*;

public class Test23_341 {
    private final Production23_341 production = new Production23_341("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}