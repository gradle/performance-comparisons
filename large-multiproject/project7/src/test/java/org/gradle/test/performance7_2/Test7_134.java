package org.gradle.test.performance7_2;

import static org.junit.Assert.*;

public class Test7_134 {
    private final Production7_134 production = new Production7_134("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}