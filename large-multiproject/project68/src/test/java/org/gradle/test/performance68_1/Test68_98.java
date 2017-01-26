package org.gradle.test.performance68_1;

import static org.junit.Assert.*;

public class Test68_98 {
    private final Production68_98 production = new Production68_98("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}