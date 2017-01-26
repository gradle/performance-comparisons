package org.gradle.test.performance68_2;

import static org.junit.Assert.*;

public class Test68_186 {
    private final Production68_186 production = new Production68_186("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}