package org.gradle.test.performance77_1;

import static org.junit.Assert.*;

public class Test77_88 {
    private final Production77_88 production = new Production77_88("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}