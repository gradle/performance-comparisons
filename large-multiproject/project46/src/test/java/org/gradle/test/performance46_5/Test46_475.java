package org.gradle.test.performance46_5;

import static org.junit.Assert.*;

public class Test46_475 {
    private final Production46_475 production = new Production46_475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}