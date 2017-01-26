package org.gradle.test.performance23_5;

import static org.junit.Assert.*;

public class Test23_473 {
    private final Production23_473 production = new Production23_473("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}