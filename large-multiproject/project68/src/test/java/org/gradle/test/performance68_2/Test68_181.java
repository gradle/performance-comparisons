package org.gradle.test.performance68_2;

import static org.junit.Assert.*;

public class Test68_181 {
    private final Production68_181 production = new Production68_181("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}