package org.gradle.test.performance77_3;

import static org.junit.Assert.*;

public class Test77_253 {
    private final Production77_253 production = new Production77_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}