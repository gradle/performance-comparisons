package org.gradle.test.performance68_5;

import static org.junit.Assert.*;

public class Test68_418 {
    private final Production68_418 production = new Production68_418("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}