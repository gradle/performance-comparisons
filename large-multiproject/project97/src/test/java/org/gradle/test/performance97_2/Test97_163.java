package org.gradle.test.performance97_2;

import static org.junit.Assert.*;

public class Test97_163 {
    private final Production97_163 production = new Production97_163("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}