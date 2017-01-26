package org.gradle.test.performance89_1;

import static org.junit.Assert.*;

public class Test89_80 {
    private final Production89_80 production = new Production89_80("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}