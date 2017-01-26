package org.gradle.test.performance97_3;

import static org.junit.Assert.*;

public class Test97_289 {
    private final Production97_289 production = new Production97_289("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}