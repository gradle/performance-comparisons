package org.gradle.test.performance97_2;

import static org.junit.Assert.*;

public class Test97_109 {
    private final Production97_109 production = new Production97_109("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}