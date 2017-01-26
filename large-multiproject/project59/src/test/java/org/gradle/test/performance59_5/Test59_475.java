package org.gradle.test.performance59_5;

import static org.junit.Assert.*;

public class Test59_475 {
    private final Production59_475 production = new Production59_475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}