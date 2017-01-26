package org.gradle.test.performance89_2;

import static org.junit.Assert.*;

public class Test89_167 {
    private final Production89_167 production = new Production89_167("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}