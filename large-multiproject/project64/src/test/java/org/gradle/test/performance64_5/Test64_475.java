package org.gradle.test.performance64_5;

import static org.junit.Assert.*;

public class Test64_475 {
    private final Production64_475 production = new Production64_475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}