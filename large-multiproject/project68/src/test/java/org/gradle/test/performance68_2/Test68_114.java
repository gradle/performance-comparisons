package org.gradle.test.performance68_2;

import static org.junit.Assert.*;

public class Test68_114 {
    private final Production68_114 production = new Production68_114("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}