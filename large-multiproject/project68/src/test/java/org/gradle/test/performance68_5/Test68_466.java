package org.gradle.test.performance68_5;

import static org.junit.Assert.*;

public class Test68_466 {
    private final Production68_466 production = new Production68_466("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}