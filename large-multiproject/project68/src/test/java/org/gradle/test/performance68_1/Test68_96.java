package org.gradle.test.performance68_1;

import static org.junit.Assert.*;

public class Test68_96 {
    private final Production68_96 production = new Production68_96("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}