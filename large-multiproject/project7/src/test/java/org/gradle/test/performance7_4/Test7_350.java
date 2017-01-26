package org.gradle.test.performance7_4;

import static org.junit.Assert.*;

public class Test7_350 {
    private final Production7_350 production = new Production7_350("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}