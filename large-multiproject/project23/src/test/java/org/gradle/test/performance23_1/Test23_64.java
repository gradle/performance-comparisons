package org.gradle.test.performance23_1;

import static org.junit.Assert.*;

public class Test23_64 {
    private final Production23_64 production = new Production23_64("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}