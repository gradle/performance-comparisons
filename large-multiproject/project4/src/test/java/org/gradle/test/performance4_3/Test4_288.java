package org.gradle.test.performance4_3;

import static org.junit.Assert.*;

public class Test4_288 {
    private final Production4_288 production = new Production4_288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}