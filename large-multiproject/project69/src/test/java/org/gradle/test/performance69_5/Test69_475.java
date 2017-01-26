package org.gradle.test.performance69_5;

import static org.junit.Assert.*;

public class Test69_475 {
    private final Production69_475 production = new Production69_475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}