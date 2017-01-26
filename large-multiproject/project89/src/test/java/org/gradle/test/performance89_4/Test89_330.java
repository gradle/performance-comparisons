package org.gradle.test.performance89_4;

import static org.junit.Assert.*;

public class Test89_330 {
    private final Production89_330 production = new Production89_330("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}