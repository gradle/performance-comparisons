package org.gradle.test.performance77_1;

import static org.junit.Assert.*;

public class Test77_80 {
    private final Production77_80 production = new Production77_80("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}