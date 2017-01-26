package org.gradle.test.performance3_3;

import static org.junit.Assert.*;

public class Test3_207 {
    private final Production3_207 production = new Production3_207("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}