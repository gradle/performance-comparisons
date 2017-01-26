package org.gradle.test.performance73_5;

import static org.junit.Assert.*;

public class Test73_475 {
    private final Production73_475 production = new Production73_475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}