package org.gradle.test.performance23_5;

import static org.junit.Assert.*;

public class Test23_455 {
    private final Production23_455 production = new Production23_455("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}