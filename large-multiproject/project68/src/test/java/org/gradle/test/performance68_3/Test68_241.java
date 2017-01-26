package org.gradle.test.performance68_3;

import static org.junit.Assert.*;

public class Test68_241 {
    private final Production68_241 production = new Production68_241("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}