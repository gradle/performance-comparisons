package org.gradle.test.performance97_2;

import static org.junit.Assert.*;

public class Test97_181 {
    private final Production97_181 production = new Production97_181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}