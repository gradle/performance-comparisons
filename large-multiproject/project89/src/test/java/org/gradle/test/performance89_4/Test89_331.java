package org.gradle.test.performance89_4;

import static org.junit.Assert.*;

public class Test89_331 {
    private final Production89_331 production = new Production89_331("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}