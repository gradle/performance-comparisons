package org.gradle.test.performance81_5;

import static org.junit.Assert.*;

public class Test81_475 {
    private final Production81_475 production = new Production81_475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}