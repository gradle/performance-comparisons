package org.gradle.test.performance16_3;

import static org.junit.Assert.*;

public class Test16_225 {
    private final Production16_225 production = new Production16_225("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}