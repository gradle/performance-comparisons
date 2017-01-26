package org.gradle.test.performance97_2;

import static org.junit.Assert.*;

public class Test97_173 {
    private final Production97_173 production = new Production97_173("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}