package org.gradle.test.performance77_2;

import static org.junit.Assert.*;

public class Test77_172 {
    private final Production77_172 production = new Production77_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}