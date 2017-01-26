package org.gradle.test.performance14_5;

import static org.junit.Assert.*;

public class Test14_475 {
    private final Production14_475 production = new Production14_475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}