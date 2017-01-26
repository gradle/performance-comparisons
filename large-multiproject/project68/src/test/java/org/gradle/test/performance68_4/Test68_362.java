package org.gradle.test.performance68_4;

import static org.junit.Assert.*;

public class Test68_362 {
    private final Production68_362 production = new Production68_362("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}