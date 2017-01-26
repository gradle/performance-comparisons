package org.gradle.test.performance68_1;

import static org.junit.Assert.*;

public class Test68_14 {
    private final Production68_14 production = new Production68_14("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}