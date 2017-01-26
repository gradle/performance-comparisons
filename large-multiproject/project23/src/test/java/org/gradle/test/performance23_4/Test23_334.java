package org.gradle.test.performance23_4;

import static org.junit.Assert.*;

public class Test23_334 {
    private final Production23_334 production = new Production23_334("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}