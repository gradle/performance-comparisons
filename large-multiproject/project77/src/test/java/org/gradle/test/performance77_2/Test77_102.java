package org.gradle.test.performance77_2;

import static org.junit.Assert.*;

public class Test77_102 {
    private final Production77_102 production = new Production77_102("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}