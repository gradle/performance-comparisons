package org.gradle.test.performance27_5;

import static org.junit.Assert.*;

public class Test27_475 {
    private final Production27_475 production = new Production27_475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}