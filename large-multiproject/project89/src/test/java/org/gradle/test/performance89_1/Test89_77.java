package org.gradle.test.performance89_1;

import static org.junit.Assert.*;

public class Test89_77 {
    private final Production89_77 production = new Production89_77("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}