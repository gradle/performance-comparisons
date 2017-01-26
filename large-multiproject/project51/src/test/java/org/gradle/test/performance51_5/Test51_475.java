package org.gradle.test.performance51_5;

import static org.junit.Assert.*;

public class Test51_475 {
    private final Production51_475 production = new Production51_475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}