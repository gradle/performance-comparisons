package org.gradle.test.performance97_5;

import static org.junit.Assert.*;

public class Test97_447 {
    private final Production97_447 production = new Production97_447("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}