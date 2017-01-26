package org.gradle.test.performance68_4;

import static org.junit.Assert.*;

public class Test68_330 {
    private final Production68_330 production = new Production68_330("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}