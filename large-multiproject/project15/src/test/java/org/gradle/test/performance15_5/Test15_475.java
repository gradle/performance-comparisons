package org.gradle.test.performance15_5;

import static org.junit.Assert.*;

public class Test15_475 {
    private final Production15_475 production = new Production15_475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}