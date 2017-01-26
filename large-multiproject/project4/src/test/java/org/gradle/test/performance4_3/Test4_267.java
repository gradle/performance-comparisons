package org.gradle.test.performance4_3;

import static org.junit.Assert.*;

public class Test4_267 {
    private final Production4_267 production = new Production4_267("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}