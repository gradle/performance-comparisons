package org.gradle.test.performance68_1;

import static org.junit.Assert.*;

public class Test68_41 {
    private final Production68_41 production = new Production68_41("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}