package org.gradle.test.performance68_2;

import static org.junit.Assert.*;

public class Test68_119 {
    private final Production68_119 production = new Production68_119("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}