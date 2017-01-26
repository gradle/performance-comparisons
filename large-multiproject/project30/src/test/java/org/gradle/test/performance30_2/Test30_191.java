package org.gradle.test.performance30_2;

import static org.junit.Assert.*;

public class Test30_191 {
    private final Production30_191 production = new Production30_191("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}