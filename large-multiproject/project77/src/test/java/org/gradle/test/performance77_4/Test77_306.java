package org.gradle.test.performance77_4;

import static org.junit.Assert.*;

public class Test77_306 {
    private final Production77_306 production = new Production77_306("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}