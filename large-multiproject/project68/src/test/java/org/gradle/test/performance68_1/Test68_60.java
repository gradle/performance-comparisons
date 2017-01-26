package org.gradle.test.performance68_1;

import static org.junit.Assert.*;

public class Test68_60 {
    private final Production68_60 production = new Production68_60("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}