package org.gradle.test.performance4_1;

import static org.junit.Assert.*;

public class Test4_40 {
    private final Production4_40 production = new Production4_40("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}