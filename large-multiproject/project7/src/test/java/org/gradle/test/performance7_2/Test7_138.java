package org.gradle.test.performance7_2;

import static org.junit.Assert.*;

public class Test7_138 {
    private final Production7_138 production = new Production7_138("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}