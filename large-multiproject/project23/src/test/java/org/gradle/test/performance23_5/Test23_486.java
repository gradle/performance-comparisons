package org.gradle.test.performance23_5;

import static org.junit.Assert.*;

public class Test23_486 {
    private final Production23_486 production = new Production23_486("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}