package org.gradle.test.performance68_1;

import static org.junit.Assert.*;

public class Test68_78 {
    private final Production68_78 production = new Production68_78("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}