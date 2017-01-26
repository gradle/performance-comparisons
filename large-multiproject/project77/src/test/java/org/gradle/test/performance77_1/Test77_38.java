package org.gradle.test.performance77_1;

import static org.junit.Assert.*;

public class Test77_38 {
    private final Production77_38 production = new Production77_38("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}