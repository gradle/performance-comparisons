package org.gradle.test.performance68_2;

import static org.junit.Assert.*;

public class Test68_104 {
    private final Production68_104 production = new Production68_104("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}