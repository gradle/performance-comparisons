package org.gradle.test.performance97_1;

import static org.junit.Assert.*;

public class Test97_4 {
    private final Production97_4 production = new Production97_4("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}