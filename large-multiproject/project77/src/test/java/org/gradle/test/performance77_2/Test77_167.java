package org.gradle.test.performance77_2;

import static org.junit.Assert.*;

public class Test77_167 {
    private final Production77_167 production = new Production77_167("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}