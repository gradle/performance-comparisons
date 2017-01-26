package org.gradle.test.performance68_4;

import static org.junit.Assert.*;

public class Test68_320 {
    private final Production68_320 production = new Production68_320("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}