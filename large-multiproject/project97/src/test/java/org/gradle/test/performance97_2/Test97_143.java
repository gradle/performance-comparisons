package org.gradle.test.performance97_2;

import static org.junit.Assert.*;

public class Test97_143 {
    private final Production97_143 production = new Production97_143("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}