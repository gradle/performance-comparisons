package org.gradle.test.performance68_4;

import static org.junit.Assert.*;

public class Test68_361 {
    private final Production68_361 production = new Production68_361("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}