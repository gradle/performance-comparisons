package org.gradle.test.performance97_1;

import static org.junit.Assert.*;

public class Test97_63 {
    private final Production97_63 production = new Production97_63("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}