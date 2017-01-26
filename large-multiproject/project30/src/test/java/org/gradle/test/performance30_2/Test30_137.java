package org.gradle.test.performance30_2;

import static org.junit.Assert.*;

public class Test30_137 {
    private final Production30_137 production = new Production30_137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}