package org.gradle.test.performance68_1;

import static org.junit.Assert.*;

public class Test68_10 {
    private final Production68_10 production = new Production68_10("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}