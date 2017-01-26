package org.gradle.test.performance97_5;

import static org.junit.Assert.*;

public class Test97_475 {
    private final Production97_475 production = new Production97_475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}