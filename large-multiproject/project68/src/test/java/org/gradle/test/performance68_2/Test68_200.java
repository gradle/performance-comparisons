package org.gradle.test.performance68_2;

import static org.junit.Assert.*;

public class Test68_200 {
    private final Production68_200 production = new Production68_200("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}