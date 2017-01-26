package org.gradle.test.performance7_5;

import static org.junit.Assert.*;

public class Test7_422 {
    private final Production7_422 production = new Production7_422("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}