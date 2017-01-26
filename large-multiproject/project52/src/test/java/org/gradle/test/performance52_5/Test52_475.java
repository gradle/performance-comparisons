package org.gradle.test.performance52_5;

import static org.junit.Assert.*;

public class Test52_475 {
    private final Production52_475 production = new Production52_475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}