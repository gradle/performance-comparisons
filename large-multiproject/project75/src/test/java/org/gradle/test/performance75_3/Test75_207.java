package org.gradle.test.performance75_3;

import static org.junit.Assert.*;

public class Test75_207 {
    private final Production75_207 production = new Production75_207("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}