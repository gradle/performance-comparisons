package org.gradle.test.performance97_2;

import static org.junit.Assert.*;

public class Test97_161 {
    private final Production97_161 production = new Production97_161("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}