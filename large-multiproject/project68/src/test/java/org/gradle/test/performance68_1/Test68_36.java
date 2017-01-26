package org.gradle.test.performance68_1;

import static org.junit.Assert.*;

public class Test68_36 {
    private final Production68_36 production = new Production68_36("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}