package org.gradle.test.performance77_2;

import static org.junit.Assert.*;

public class Test77_199 {
    private final Production77_199 production = new Production77_199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}