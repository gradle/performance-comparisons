package org.gradle.test.performance97_1;

import static org.junit.Assert.*;

public class Test97_46 {
    private final Production97_46 production = new Production97_46("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}