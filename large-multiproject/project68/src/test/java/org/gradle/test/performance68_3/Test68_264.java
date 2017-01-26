package org.gradle.test.performance68_3;

import static org.junit.Assert.*;

public class Test68_264 {
    private final Production68_264 production = new Production68_264("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}