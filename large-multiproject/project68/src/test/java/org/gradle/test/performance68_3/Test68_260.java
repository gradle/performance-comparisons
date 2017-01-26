package org.gradle.test.performance68_3;

import static org.junit.Assert.*;

public class Test68_260 {
    private final Production68_260 production = new Production68_260("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}