package org.gradle.test.performance89_5;

import static org.junit.Assert.*;

public class Test89_432 {
    private final Production89_432 production = new Production89_432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}