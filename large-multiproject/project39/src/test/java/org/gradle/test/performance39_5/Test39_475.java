package org.gradle.test.performance39_5;

import static org.junit.Assert.*;

public class Test39_475 {
    private final Production39_475 production = new Production39_475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}