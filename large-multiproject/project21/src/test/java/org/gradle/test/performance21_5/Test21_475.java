package org.gradle.test.performance21_5;

import static org.junit.Assert.*;

public class Test21_475 {
    private final Production21_475 production = new Production21_475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}