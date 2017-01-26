package org.gradle.test.performance72_5;

import static org.junit.Assert.*;

public class Test72_475 {
    private final Production72_475 production = new Production72_475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}