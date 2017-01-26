package org.gradle.test.performance97_2;

import static org.junit.Assert.*;

public class Test97_176 {
    private final Production97_176 production = new Production97_176("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}