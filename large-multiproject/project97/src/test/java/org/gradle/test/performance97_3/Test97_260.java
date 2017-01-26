package org.gradle.test.performance97_3;

import static org.junit.Assert.*;

public class Test97_260 {
    private final Production97_260 production = new Production97_260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}