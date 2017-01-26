package org.gradle.test.performance97_3;

import static org.junit.Assert.*;

public class Test97_294 {
    private final Production97_294 production = new Production97_294("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}