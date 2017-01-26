package org.gradle.test.performance68_1;

import static org.junit.Assert.*;

public class Test68_39 {
    private final Production68_39 production = new Production68_39("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}