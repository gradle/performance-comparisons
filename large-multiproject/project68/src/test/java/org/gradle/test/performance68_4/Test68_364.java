package org.gradle.test.performance68_4;

import static org.junit.Assert.*;

public class Test68_364 {
    private final Production68_364 production = new Production68_364("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}