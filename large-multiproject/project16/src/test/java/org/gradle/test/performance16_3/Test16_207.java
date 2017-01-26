package org.gradle.test.performance16_3;

import static org.junit.Assert.*;

public class Test16_207 {
    private final Production16_207 production = new Production16_207("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}