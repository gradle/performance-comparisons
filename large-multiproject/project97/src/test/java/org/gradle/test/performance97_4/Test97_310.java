package org.gradle.test.performance97_4;

import static org.junit.Assert.*;

public class Test97_310 {
    private final Production97_310 production = new Production97_310("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}