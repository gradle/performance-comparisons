package org.gradle.test.performance68_1;

import static org.junit.Assert.*;

public class Test68_46 {
    private final Production68_46 production = new Production68_46("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}