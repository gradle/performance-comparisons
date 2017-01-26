package org.gradle.test.performance34_5;

import static org.junit.Assert.*;

public class Test34_475 {
    private final Production34_475 production = new Production34_475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}