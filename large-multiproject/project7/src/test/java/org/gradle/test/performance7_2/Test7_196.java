package org.gradle.test.performance7_2;

import static org.junit.Assert.*;

public class Test7_196 {
    private final Production7_196 production = new Production7_196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}