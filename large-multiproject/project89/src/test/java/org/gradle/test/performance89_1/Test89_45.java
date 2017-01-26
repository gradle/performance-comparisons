package org.gradle.test.performance89_1;

import static org.junit.Assert.*;

public class Test89_45 {
    private final Production89_45 production = new Production89_45("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}