package org.gradle.test.performance68_3;

import static org.junit.Assert.*;

public class Test68_253 {
    private final Production68_253 production = new Production68_253("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}