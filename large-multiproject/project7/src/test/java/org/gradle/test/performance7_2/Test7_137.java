package org.gradle.test.performance7_2;

import static org.junit.Assert.*;

public class Test7_137 {
    private final Production7_137 production = new Production7_137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}