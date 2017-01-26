package org.gradle.test.performance68_1;

import static org.junit.Assert.*;

public class Test68_100 {
    private final Production68_100 production = new Production68_100("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}