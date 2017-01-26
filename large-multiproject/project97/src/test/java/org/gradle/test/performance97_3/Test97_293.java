package org.gradle.test.performance97_3;

import static org.junit.Assert.*;

public class Test97_293 {
    private final Production97_293 production = new Production97_293("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}