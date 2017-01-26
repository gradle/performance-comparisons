package org.gradle.test.performance79_5;

import static org.junit.Assert.*;

public class Test79_475 {
    private final Production79_475 production = new Production79_475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}