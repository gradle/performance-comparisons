package org.gradle.test.performance49_5;

import static org.junit.Assert.*;

public class Test49_475 {
    private final Production49_475 production = new Production49_475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}