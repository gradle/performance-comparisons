package org.gradle.test.performance97_3;

import static org.junit.Assert.*;

public class Test97_228 {
    private final Production97_228 production = new Production97_228("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}