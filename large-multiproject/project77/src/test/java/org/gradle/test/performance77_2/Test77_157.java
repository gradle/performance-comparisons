package org.gradle.test.performance77_2;

import static org.junit.Assert.*;

public class Test77_157 {
    private final Production77_157 production = new Production77_157("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}