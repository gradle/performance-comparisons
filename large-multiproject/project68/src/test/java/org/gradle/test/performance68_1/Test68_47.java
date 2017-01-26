package org.gradle.test.performance68_1;

import static org.junit.Assert.*;

public class Test68_47 {
    private final Production68_47 production = new Production68_47("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}