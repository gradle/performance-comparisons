package org.gradle.test.performance89_2;

import static org.junit.Assert.*;

public class Test89_172 {
    private final Production89_172 production = new Production89_172("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}