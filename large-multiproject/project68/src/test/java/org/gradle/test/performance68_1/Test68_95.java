package org.gradle.test.performance68_1;

import static org.junit.Assert.*;

public class Test68_95 {
    private final Production68_95 production = new Production68_95("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}