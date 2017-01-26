package org.gradle.test.performance68_1;

import static org.junit.Assert.*;

public class Test68_3 {
    private final Production68_3 production = new Production68_3("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}