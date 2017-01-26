package org.gradle.test.performance68_1;

import static org.junit.Assert.*;

public class Test68_89 {
    private final Production68_89 production = new Production68_89("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}