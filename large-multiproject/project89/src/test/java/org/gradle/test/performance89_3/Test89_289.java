package org.gradle.test.performance89_3;

import static org.junit.Assert.*;

public class Test89_289 {
    private final Production89_289 production = new Production89_289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}