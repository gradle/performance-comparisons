package org.gradle.test.performance4_1;

import static org.junit.Assert.*;

public class Test4_100 {
    private final Production4_100 production = new Production4_100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}