package org.gradle.test.performance97_2;

import static org.junit.Assert.*;

public class Test97_180 {
    private final Production97_180 production = new Production97_180("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}