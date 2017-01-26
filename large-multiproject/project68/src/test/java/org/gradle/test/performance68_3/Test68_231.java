package org.gradle.test.performance68_3;

import static org.junit.Assert.*;

public class Test68_231 {
    private final Production68_231 production = new Production68_231("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}