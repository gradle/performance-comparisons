package org.gradle.test.performance95_5;

import static org.junit.Assert.*;

public class Test95_475 {
    private final Production95_475 production = new Production95_475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}