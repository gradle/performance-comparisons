package org.gradle.test.performance68_2;

import static org.junit.Assert.*;

public class Test68_106 {
    private final Production68_106 production = new Production68_106("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}