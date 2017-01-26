package org.gradle.test.performance68_4;

import static org.junit.Assert.*;

public class Test68_386 {
    private final Production68_386 production = new Production68_386("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}