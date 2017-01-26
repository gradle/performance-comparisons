package org.gradle.test.performance68_2;

import static org.junit.Assert.*;

public class Test68_199 {
    private final Production68_199 production = new Production68_199("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}