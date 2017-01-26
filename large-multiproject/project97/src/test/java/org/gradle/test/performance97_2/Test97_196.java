package org.gradle.test.performance97_2;

import static org.junit.Assert.*;

public class Test97_196 {
    private final Production97_196 production = new Production97_196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}