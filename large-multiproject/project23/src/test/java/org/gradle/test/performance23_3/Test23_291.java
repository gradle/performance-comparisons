package org.gradle.test.performance23_3;

import static org.junit.Assert.*;

public class Test23_291 {
    private final Production23_291 production = new Production23_291("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}