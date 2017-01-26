package org.gradle.test.performance89_5;

import static org.junit.Assert.*;

public class Test89_442 {
    private final Production89_442 production = new Production89_442("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}