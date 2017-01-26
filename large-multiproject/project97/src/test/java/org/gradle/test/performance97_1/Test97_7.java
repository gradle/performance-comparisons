package org.gradle.test.performance97_1;

import static org.junit.Assert.*;

public class Test97_7 {
    private final Production97_7 production = new Production97_7("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}