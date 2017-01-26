package org.gradle.test.performance97_2;

import static org.junit.Assert.*;

public class Test97_186 {
    private final Production97_186 production = new Production97_186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}