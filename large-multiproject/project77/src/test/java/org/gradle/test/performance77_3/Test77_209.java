package org.gradle.test.performance77_3;

import static org.junit.Assert.*;

public class Test77_209 {
    private final Production77_209 production = new Production77_209("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}