package org.gradle.test.performance97_3;

import static org.junit.Assert.*;

public class Test97_266 {
    private final Production97_266 production = new Production97_266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}