package org.gradle.test.performance5_3;

import static org.junit.Assert.*;

public class Test5_207 {
    private final Production5_207 production = new Production5_207("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}