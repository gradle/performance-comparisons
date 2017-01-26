package org.gradle.test.performance68_2;

import static org.junit.Assert.*;

public class Test68_155 {
    private final Production68_155 production = new Production68_155("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}