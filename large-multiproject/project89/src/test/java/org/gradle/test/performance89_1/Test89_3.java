package org.gradle.test.performance89_1;

import static org.junit.Assert.*;

public class Test89_3 {
    private final Production89_3 production = new Production89_3("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}