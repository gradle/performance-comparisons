package org.gradle.test.performance77_1;

import static org.junit.Assert.*;

public class Test77_67 {
    private final Production77_67 production = new Production77_67("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}