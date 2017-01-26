package org.gradle.test.performance80_3;

import static org.junit.Assert.*;

public class Test80_207 {
    private final Production80_207 production = new Production80_207("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}