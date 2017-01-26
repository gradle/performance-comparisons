package org.gradle.test.performance68_1;

import static org.junit.Assert.*;

public class Test68_38 {
    private final Production68_38 production = new Production68_38("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}