package org.gradle.test.performance97_2;

import static org.junit.Assert.*;

public class Test97_145 {
    private final Production97_145 production = new Production97_145("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}