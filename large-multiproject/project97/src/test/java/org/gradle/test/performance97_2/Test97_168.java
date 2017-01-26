package org.gradle.test.performance97_2;

import static org.junit.Assert.*;

public class Test97_168 {
    private final Production97_168 production = new Production97_168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}