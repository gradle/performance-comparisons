package org.gradle.test.performance23_4;

import static org.junit.Assert.*;

public class Test23_371 {
    private final Production23_371 production = new Production23_371("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}