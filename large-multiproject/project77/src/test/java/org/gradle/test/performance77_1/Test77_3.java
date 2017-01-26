package org.gradle.test.performance77_1;

import static org.junit.Assert.*;

public class Test77_3 {
    private final Production77_3 production = new Production77_3("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}