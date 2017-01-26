package org.gradle.test.performance68_1;

import static org.junit.Assert.*;

public class Test68_29 {
    private final Production68_29 production = new Production68_29("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}