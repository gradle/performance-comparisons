package org.gradle.test.performance97_3;

import static org.junit.Assert.*;

public class Test97_220 {
    private final Production97_220 production = new Production97_220("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}