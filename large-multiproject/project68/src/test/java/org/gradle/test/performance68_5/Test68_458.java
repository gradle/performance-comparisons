package org.gradle.test.performance68_5;

import static org.junit.Assert.*;

public class Test68_458 {
    private final Production68_458 production = new Production68_458("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}