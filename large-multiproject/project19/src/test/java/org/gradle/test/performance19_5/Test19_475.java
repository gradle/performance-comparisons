package org.gradle.test.performance19_5;

import static org.junit.Assert.*;

public class Test19_475 {
    private final Production19_475 production = new Production19_475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}