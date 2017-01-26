package org.gradle.test.performance77_1;

import static org.junit.Assert.*;

public class Test77_75 {
    private final Production77_75 production = new Production77_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}