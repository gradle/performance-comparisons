package org.gradle.test.performance68_3;

import static org.junit.Assert.*;

public class Test68_214 {
    private final Production68_214 production = new Production68_214("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}