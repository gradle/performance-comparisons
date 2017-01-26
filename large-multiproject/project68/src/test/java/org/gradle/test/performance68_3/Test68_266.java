package org.gradle.test.performance68_3;

import static org.junit.Assert.*;

public class Test68_266 {
    private final Production68_266 production = new Production68_266("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}