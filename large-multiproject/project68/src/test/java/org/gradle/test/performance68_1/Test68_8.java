package org.gradle.test.performance68_1;

import static org.junit.Assert.*;

public class Test68_8 {
    private final Production68_8 production = new Production68_8("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}