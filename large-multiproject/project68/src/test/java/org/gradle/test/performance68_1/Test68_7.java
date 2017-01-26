package org.gradle.test.performance68_1;

import static org.junit.Assert.*;

public class Test68_7 {
    private final Production68_7 production = new Production68_7("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}