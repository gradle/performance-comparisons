package org.gradle.test.performance68_1;

import static org.junit.Assert.*;

public class Test68_67 {
    private final Production68_67 production = new Production68_67("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}