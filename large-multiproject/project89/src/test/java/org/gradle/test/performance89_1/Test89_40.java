package org.gradle.test.performance89_1;

import static org.junit.Assert.*;

public class Test89_40 {
    private final Production89_40 production = new Production89_40("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}