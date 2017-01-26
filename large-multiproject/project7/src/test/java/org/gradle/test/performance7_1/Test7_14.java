package org.gradle.test.performance7_1;

import static org.junit.Assert.*;

public class Test7_14 {
    private final Production7_14 production = new Production7_14("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}