package org.gradle.test.performance7_3;

import static org.junit.Assert.*;

public class Test7_238 {
    private final Production7_238 production = new Production7_238("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}