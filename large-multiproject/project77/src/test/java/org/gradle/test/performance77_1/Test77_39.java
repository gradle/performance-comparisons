package org.gradle.test.performance77_1;

import static org.junit.Assert.*;

public class Test77_39 {
    private final Production77_39 production = new Production77_39("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}