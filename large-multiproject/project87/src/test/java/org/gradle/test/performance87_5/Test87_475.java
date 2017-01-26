package org.gradle.test.performance87_5;

import static org.junit.Assert.*;

public class Test87_475 {
    private final Production87_475 production = new Production87_475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}