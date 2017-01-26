package org.gradle.test.performance50_5;

import static org.junit.Assert.*;

public class Test50_475 {
    private final Production50_475 production = new Production50_475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}