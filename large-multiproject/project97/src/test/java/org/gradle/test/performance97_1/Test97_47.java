package org.gradle.test.performance97_1;

import static org.junit.Assert.*;

public class Test97_47 {
    private final Production97_47 production = new Production97_47("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}