package org.gradle.test.performance68_2;

import static org.junit.Assert.*;

public class Test68_137 {
    private final Production68_137 production = new Production68_137("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}