package org.gradle.test.performance62_5;

import static org.junit.Assert.*;

public class Test62_475 {
    private final Production62_475 production = new Production62_475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}