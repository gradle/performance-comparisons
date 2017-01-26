package org.gradle.test.performance16_3;

import static org.junit.Assert.*;

public class Test16_294 {
    private final Production16_294 production = new Production16_294("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}