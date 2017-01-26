package org.gradle.test.performance89_1;

import static org.junit.Assert.*;

public class Test89_72 {
    private final Production89_72 production = new Production89_72("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}