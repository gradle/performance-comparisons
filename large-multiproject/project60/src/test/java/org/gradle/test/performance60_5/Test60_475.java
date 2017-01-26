package org.gradle.test.performance60_5;

import static org.junit.Assert.*;

public class Test60_475 {
    private final Production60_475 production = new Production60_475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}