package org.gradle.test.performance68_2;

import static org.junit.Assert.*;

public class Test68_196 {
    private final Production68_196 production = new Production68_196("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}