package org.gradle.test.performance50_3;

import static org.junit.Assert.*;

public class Test50_207 {
    private final Production50_207 production = new Production50_207("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}