package org.gradle.test.performance92_3;

import static org.junit.Assert.*;

public class Test92_288 {
    private final Production92_288 production = new Production92_288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}