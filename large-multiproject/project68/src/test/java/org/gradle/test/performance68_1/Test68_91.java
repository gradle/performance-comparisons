package org.gradle.test.performance68_1;

import static org.junit.Assert.*;

public class Test68_91 {
    private final Production68_91 production = new Production68_91("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}