package org.gradle.test.performance97_2;

import static org.junit.Assert.*;

public class Test97_114 {
    private final Production97_114 production = new Production97_114("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}