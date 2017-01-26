package org.gradle.test.performance68_3;

import static org.junit.Assert.*;

public class Test68_257 {
    private final Production68_257 production = new Production68_257("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}