package org.gradle.test.performance68_5;

import static org.junit.Assert.*;

public class Test68_432 {
    private final Production68_432 production = new Production68_432("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}