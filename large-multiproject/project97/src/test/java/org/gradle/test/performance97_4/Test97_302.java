package org.gradle.test.performance97_4;

import static org.junit.Assert.*;

public class Test97_302 {
    private final Production97_302 production = new Production97_302("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}