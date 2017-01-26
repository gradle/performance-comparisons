package org.gradle.test.performance77_2;

import static org.junit.Assert.*;

public class Test77_106 {
    private final Production77_106 production = new Production77_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}