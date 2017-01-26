package org.gradle.test.performance68_1;

import static org.junit.Assert.*;

public class Test68_68 {
    private final Production68_68 production = new Production68_68("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}