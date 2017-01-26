package org.gradle.test.performance68_2;

import static org.junit.Assert.*;

public class Test68_112 {
    private final Production68_112 production = new Production68_112("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}