package org.gradle.test.performance77_2;

import static org.junit.Assert.*;

public class Test77_166 {
    private final Production77_166 production = new Production77_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}