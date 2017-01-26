package org.gradle.test.performance68_2;

import static org.junit.Assert.*;

public class Test68_168 {
    private final Production68_168 production = new Production68_168("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}