package org.gradle.test.performance68_4;

import static org.junit.Assert.*;

public class Test68_324 {
    private final Production68_324 production = new Production68_324("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}