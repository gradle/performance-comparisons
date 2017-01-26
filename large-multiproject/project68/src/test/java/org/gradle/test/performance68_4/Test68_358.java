package org.gradle.test.performance68_4;

import static org.junit.Assert.*;

public class Test68_358 {
    private final Production68_358 production = new Production68_358("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}