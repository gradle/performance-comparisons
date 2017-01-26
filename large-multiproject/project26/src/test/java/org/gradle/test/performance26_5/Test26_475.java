package org.gradle.test.performance26_5;

import static org.junit.Assert.*;

public class Test26_475 {
    private final Production26_475 production = new Production26_475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}