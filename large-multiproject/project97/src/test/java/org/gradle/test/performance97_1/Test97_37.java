package org.gradle.test.performance97_1;

import static org.junit.Assert.*;

public class Test97_37 {
    private final Production97_37 production = new Production97_37("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}