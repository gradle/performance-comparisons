package org.gradle.test.performance7_3;

import static org.junit.Assert.*;

public class Test7_288 {
    private final Production7_288 production = new Production7_288("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}