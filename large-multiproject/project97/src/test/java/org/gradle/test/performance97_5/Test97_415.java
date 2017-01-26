package org.gradle.test.performance97_5;

import static org.junit.Assert.*;

public class Test97_415 {
    private final Production97_415 production = new Production97_415("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}