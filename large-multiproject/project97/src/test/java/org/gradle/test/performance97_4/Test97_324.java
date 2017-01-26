package org.gradle.test.performance97_4;

import static org.junit.Assert.*;

public class Test97_324 {
    private final Production97_324 production = new Production97_324("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}