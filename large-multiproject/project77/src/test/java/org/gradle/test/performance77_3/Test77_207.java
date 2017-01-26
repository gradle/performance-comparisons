package org.gradle.test.performance77_3;

import static org.junit.Assert.*;

public class Test77_207 {
    private final Production77_207 production = new Production77_207("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}