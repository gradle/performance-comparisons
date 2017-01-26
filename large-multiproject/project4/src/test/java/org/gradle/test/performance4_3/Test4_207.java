package org.gradle.test.performance4_3;

import static org.junit.Assert.*;

public class Test4_207 {
    private final Production4_207 production = new Production4_207("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}