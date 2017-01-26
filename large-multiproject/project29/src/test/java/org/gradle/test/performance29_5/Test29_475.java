package org.gradle.test.performance29_5;

import static org.junit.Assert.*;

public class Test29_475 {
    private final Production29_475 production = new Production29_475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}