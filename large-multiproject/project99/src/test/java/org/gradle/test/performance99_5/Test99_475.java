package org.gradle.test.performance99_5;

import static org.junit.Assert.*;

public class Test99_475 {
    private final Production99_475 production = new Production99_475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}