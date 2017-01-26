package org.gradle.test.performance7_3;

import static org.junit.Assert.*;

public class Test7_289 {
    private final Production7_289 production = new Production7_289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}