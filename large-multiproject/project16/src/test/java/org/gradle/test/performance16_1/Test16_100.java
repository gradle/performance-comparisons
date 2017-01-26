package org.gradle.test.performance16_1;

import static org.junit.Assert.*;

public class Test16_100 {
    private final Production16_100 production = new Production16_100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}