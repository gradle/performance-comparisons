package org.gradle.test.performance97_1;

import static org.junit.Assert.*;

public class Test97_5 {
    private final Production97_5 production = new Production97_5("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}