package org.gradle.test.performance24_5;

import static org.junit.Assert.*;

public class Test24_475 {
    private final Production24_475 production = new Production24_475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}