package org.gradle.test.performance68_1;

import static org.junit.Assert.*;

public class Test68_75 {
    private final Production68_75 production = new Production68_75("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}