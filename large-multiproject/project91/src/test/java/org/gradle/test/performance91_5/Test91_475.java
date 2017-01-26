package org.gradle.test.performance91_5;

import static org.junit.Assert.*;

public class Test91_475 {
    private final Production91_475 production = new Production91_475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}