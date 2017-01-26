package org.gradle.test.performance17_5;

import static org.junit.Assert.*;

public class Test17_475 {
    private final Production17_475 production = new Production17_475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}