package org.gradle.test.performance68_5;

import static org.junit.Assert.*;

public class Test68_475 {
    private final Production68_475 production = new Production68_475("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}