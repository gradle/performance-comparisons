package org.gradle.test.performance77_1;

import static org.junit.Assert.*;

public class Test77_29 {
    private final Production77_29 production = new Production77_29("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}