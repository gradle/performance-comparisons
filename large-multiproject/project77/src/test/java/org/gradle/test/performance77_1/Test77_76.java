package org.gradle.test.performance77_1;

import static org.junit.Assert.*;

public class Test77_76 {
    private final Production77_76 production = new Production77_76("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}