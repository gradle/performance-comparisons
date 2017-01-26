package org.gradle.test.performance68_5;

import static org.junit.Assert.*;

public class Test68_442 {
    private final Production68_442 production = new Production68_442("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}