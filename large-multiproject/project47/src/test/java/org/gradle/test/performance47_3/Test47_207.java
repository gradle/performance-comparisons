package org.gradle.test.performance47_3;

import static org.junit.Assert.*;

public class Test47_207 {
    private final Production47_207 production = new Production47_207("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}