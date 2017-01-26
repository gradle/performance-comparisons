package org.gradle.test.performance68_1;

import static org.junit.Assert.*;

public class Test68_81 {
    private final Production68_81 production = new Production68_81("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}