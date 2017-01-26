package org.gradle.test.performance68_3;

import static org.junit.Assert.*;

public class Test68_249 {
    private final Production68_249 production = new Production68_249("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}