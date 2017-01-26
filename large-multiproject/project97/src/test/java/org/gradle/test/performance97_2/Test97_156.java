package org.gradle.test.performance97_2;

import static org.junit.Assert.*;

public class Test97_156 {
    private final Production97_156 production = new Production97_156("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}