package org.gradle.test.performance66_5;

import static org.junit.Assert.*;

public class Test66_475 {
    private final Production66_475 production = new Production66_475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}