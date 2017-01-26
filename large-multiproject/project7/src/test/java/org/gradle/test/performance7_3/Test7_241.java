package org.gradle.test.performance7_3;

import static org.junit.Assert.*;

public class Test7_241 {
    private final Production7_241 production = new Production7_241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}