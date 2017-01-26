package org.gradle.test.performance89_1;

import static org.junit.Assert.*;

public class Test89_100 {
    private final Production89_100 production = new Production89_100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}