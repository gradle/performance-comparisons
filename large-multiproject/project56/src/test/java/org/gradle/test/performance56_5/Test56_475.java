package org.gradle.test.performance56_5;

import static org.junit.Assert.*;

public class Test56_475 {
    private final Production56_475 production = new Production56_475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}