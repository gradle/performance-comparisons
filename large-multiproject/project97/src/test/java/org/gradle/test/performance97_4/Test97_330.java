package org.gradle.test.performance97_4;

import static org.junit.Assert.*;

public class Test97_330 {
    private final Production97_330 production = new Production97_330("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}