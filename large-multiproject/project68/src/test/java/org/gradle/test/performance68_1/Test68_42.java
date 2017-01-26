package org.gradle.test.performance68_1;

import static org.junit.Assert.*;

public class Test68_42 {
    private final Production68_42 production = new Production68_42("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}