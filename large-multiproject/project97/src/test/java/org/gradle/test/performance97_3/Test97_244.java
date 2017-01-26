package org.gradle.test.performance97_3;

import static org.junit.Assert.*;

public class Test97_244 {
    private final Production97_244 production = new Production97_244("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}