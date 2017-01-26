package org.gradle.test.performance31_3;

import static org.junit.Assert.*;

public class Test31_207 {
    private final Production31_207 production = new Production31_207("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}