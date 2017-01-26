package org.gradle.test.performance68_3;

import static org.junit.Assert.*;

public class Test68_202 {
    private final Production68_202 production = new Production68_202("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}