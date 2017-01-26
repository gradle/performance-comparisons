package org.gradle.test.performance68_3;

import static org.junit.Assert.*;

public class Test68_215 {
    private final Production68_215 production = new Production68_215("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}