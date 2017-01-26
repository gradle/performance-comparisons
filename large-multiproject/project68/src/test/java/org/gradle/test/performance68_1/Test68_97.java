package org.gradle.test.performance68_1;

import static org.junit.Assert.*;

public class Test68_97 {
    private final Production68_97 production = new Production68_97("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}