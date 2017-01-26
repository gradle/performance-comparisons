package org.gradle.test.performance68_1;

import static org.junit.Assert.*;

public class Test68_71 {
    private final Production68_71 production = new Production68_71("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}