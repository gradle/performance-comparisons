package org.gradle.test.performance90_5;

import static org.junit.Assert.*;

public class Test90_475 {
    private final Production90_475 production = new Production90_475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}