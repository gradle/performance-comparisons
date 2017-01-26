package org.gradle.test.performance89_1;

import static org.junit.Assert.*;

public class Test89_75 {
    private final Production89_75 production = new Production89_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}