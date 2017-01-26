package org.gradle.test.performance7_1;

import static org.junit.Assert.*;

public class Test7_51 {
    private final Production7_51 production = new Production7_51("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}