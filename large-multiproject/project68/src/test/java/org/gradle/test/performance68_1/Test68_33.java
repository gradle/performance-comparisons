package org.gradle.test.performance68_1;

import static org.junit.Assert.*;

public class Test68_33 {
    private final Production68_33 production = new Production68_33("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}