package org.gradle.test.performance97_2;

import static org.junit.Assert.*;

public class Test97_106 {
    private final Production97_106 production = new Production97_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}