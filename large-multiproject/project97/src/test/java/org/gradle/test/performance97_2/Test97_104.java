package org.gradle.test.performance97_2;

import static org.junit.Assert.*;

public class Test97_104 {
    private final Production97_104 production = new Production97_104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}