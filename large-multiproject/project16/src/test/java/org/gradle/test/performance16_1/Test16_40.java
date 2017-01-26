package org.gradle.test.performance16_1;

import static org.junit.Assert.*;

public class Test16_40 {
    private final Production16_40 production = new Production16_40("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}