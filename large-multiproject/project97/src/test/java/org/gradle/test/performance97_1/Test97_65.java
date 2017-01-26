package org.gradle.test.performance97_1;

import static org.junit.Assert.*;

public class Test97_65 {
    private final Production97_65 production = new Production97_65("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}