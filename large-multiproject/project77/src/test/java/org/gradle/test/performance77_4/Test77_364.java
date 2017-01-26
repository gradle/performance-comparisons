package org.gradle.test.performance77_4;

import static org.junit.Assert.*;

public class Test77_364 {
    private final Production77_364 production = new Production77_364("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}