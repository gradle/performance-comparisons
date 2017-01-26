package org.gradle.test.performance89_3;

import static org.junit.Assert.*;

public class Test89_288 {
    private final Production89_288 production = new Production89_288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}