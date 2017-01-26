package org.gradle.test.performance68_5;

import static org.junit.Assert.*;

public class Test68_465 {
    private final Production68_465 production = new Production68_465("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}