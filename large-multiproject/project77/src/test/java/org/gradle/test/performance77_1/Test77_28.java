package org.gradle.test.performance77_1;

import static org.junit.Assert.*;

public class Test77_28 {
    private final Production77_28 production = new Production77_28("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}