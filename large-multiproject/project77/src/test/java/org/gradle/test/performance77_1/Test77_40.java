package org.gradle.test.performance77_1;

import static org.junit.Assert.*;

public class Test77_40 {
    private final Production77_40 production = new Production77_40("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}