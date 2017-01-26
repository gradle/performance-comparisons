package org.gradle.test.performance23_4;

import static org.junit.Assert.*;

public class Test23_400 {
    private final Production23_400 production = new Production23_400("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}