package org.gradle.test.performance2_5;

import static org.junit.Assert.*;

public class Test2_475 {
    private final Production2_475 production = new Production2_475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}