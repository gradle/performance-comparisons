package org.gradle.test.performance77_1;

import static org.junit.Assert.*;

public class Test77_58 {
    private final Production77_58 production = new Production77_58("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}