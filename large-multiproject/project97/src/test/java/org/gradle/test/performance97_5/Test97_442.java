package org.gradle.test.performance97_5;

import static org.junit.Assert.*;

public class Test97_442 {
    private final Production97_442 production = new Production97_442("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}