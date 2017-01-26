package org.gradle.test.performance68_2;

import static org.junit.Assert.*;

public class Test68_166 {
    private final Production68_166 production = new Production68_166("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}