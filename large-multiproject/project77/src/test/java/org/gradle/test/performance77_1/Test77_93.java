package org.gradle.test.performance77_1;

import static org.junit.Assert.*;

public class Test77_93 {
    private final Production77_93 production = new Production77_93("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}