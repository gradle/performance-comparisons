package org.gradle.test.performance97_3;

import static org.junit.Assert.*;

public class Test97_286 {
    private final Production97_286 production = new Production97_286("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}