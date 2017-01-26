package org.gradle.test.performance89_5;

import static org.junit.Assert.*;

public class Test89_495 {
    private final Production89_495 production = new Production89_495("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}