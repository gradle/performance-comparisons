package org.gradle.test.performance97_1;

import static org.junit.Assert.*;

public class Test97_87 {
    private final Production97_87 production = new Production97_87("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}