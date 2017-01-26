package org.gradle.test.performance68_1;

import static org.junit.Assert.*;

public class Test68_9 {
    private final Production68_9 production = new Production68_9("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}