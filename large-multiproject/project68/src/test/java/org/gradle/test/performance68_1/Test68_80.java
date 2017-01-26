package org.gradle.test.performance68_1;

import static org.junit.Assert.*;

public class Test68_80 {
    private final Production68_80 production = new Production68_80("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}