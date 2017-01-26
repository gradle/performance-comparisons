package org.gradle.test.performance68_5;

import static org.junit.Assert.*;

public class Test68_447 {
    private final Production68_447 production = new Production68_447("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}