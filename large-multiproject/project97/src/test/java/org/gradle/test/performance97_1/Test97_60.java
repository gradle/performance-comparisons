package org.gradle.test.performance97_1;

import static org.junit.Assert.*;

public class Test97_60 {
    private final Production97_60 production = new Production97_60("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}