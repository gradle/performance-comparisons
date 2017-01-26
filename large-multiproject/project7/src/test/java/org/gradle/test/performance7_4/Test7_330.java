package org.gradle.test.performance7_4;

import static org.junit.Assert.*;

public class Test7_330 {
    private final Production7_330 production = new Production7_330("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}