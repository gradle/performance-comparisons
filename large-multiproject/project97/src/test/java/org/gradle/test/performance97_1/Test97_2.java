package org.gradle.test.performance97_1;

import static org.junit.Assert.*;

public class Test97_2 {
    private final Production97_2 production = new Production97_2("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}