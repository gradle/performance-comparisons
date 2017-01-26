package org.gradle.test.performance89_5;

import static org.junit.Assert.*;

public class Test89_465 {
    private final Production89_465 production = new Production89_465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}