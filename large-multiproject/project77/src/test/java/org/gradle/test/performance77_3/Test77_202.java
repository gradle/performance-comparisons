package org.gradle.test.performance77_3;

import static org.junit.Assert.*;

public class Test77_202 {
    private final Production77_202 production = new Production77_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}