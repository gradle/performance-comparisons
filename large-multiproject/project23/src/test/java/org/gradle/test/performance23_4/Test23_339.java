package org.gradle.test.performance23_4;

import static org.junit.Assert.*;

public class Test23_339 {
    private final Production23_339 production = new Production23_339("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}