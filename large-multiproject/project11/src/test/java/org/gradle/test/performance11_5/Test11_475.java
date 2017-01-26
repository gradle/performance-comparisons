package org.gradle.test.performance11_5;

import static org.junit.Assert.*;

public class Test11_475 {
    private final Production11_475 production = new Production11_475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}