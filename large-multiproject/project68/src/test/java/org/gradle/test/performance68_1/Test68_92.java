package org.gradle.test.performance68_1;

import static org.junit.Assert.*;

public class Test68_92 {
    private final Production68_92 production = new Production68_92("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}