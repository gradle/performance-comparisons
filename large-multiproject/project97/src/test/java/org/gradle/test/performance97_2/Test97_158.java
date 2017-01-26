package org.gradle.test.performance97_2;

import static org.junit.Assert.*;

public class Test97_158 {
    private final Production97_158 production = new Production97_158("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}