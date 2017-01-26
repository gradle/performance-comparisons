package org.gradle.test.performance68_2;

import static org.junit.Assert.*;

public class Test68_157 {
    private final Production68_157 production = new Production68_157("value");

    @org.junit.Test
    public void test() {
        assertEquals(production.getProperty(), "value");
    }
}