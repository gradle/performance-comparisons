package org.gradle.test.performance97_2;

import static org.junit.Assert.*;

public class Test97_150 {
    private final Production97_150 production = new Production97_150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}