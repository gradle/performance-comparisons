package org.gradle.test.performance68_1;

import static org.junit.Assert.*;

public class Test68_51 {
    private final Production68_51 production = new Production68_51("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}