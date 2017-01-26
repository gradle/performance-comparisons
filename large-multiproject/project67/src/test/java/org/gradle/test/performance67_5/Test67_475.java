package org.gradle.test.performance67_5;

import static org.junit.Assert.*;

public class Test67_475 {
    private final Production67_475 production = new Production67_475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}