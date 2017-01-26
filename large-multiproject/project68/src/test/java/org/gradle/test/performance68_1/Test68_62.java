package org.gradle.test.performance68_1;

import static org.junit.Assert.*;

public class Test68_62 {
    private final Production68_62 production = new Production68_62("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}