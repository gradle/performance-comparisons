package org.gradle.test.performance97_2;

import static org.junit.Assert.*;

public class Test97_140 {
    private final Production97_140 production = new Production97_140("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}