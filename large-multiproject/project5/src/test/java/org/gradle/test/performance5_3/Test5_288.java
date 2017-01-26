package org.gradle.test.performance5_3;

import static org.junit.Assert.*;

public class Test5_288 {
    private final Production5_288 production = new Production5_288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}