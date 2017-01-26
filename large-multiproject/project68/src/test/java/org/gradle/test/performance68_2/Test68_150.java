package org.gradle.test.performance68_2;

import static org.junit.Assert.*;

public class Test68_150 {
    private final Production68_150 production = new Production68_150("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}