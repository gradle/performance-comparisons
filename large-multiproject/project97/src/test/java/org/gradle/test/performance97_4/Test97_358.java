package org.gradle.test.performance97_4;

import static org.junit.Assert.*;

public class Test97_358 {
    private final Production97_358 production = new Production97_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}